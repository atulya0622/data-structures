import java.io.*;
public class LinkedList{
		Node head;
		
		public static class Node{
			int data;
			Node next;
			
			Node(int d){
				data=d;
				next=null;
			}
		}
		public static LinkedList insertAtTail(LinkedList list,int data){
			Node new_node=new Node(data);
			new_node.next=null;
			
			if(list.head==null)
			{
               list.head=new_node;
			}
			else{
				Node last=list.head;
				while(last.next!=null){
					last=last.next;
				}
				last.next=new_node;
			}
			return list;
		}
		public static LinkedList insertAtHead(LinkedList list,int data){
			Node new_node=new Node(data);
			new_node.next=null;
			if(list.head==null)
				list.head=new_node;
			else{
				Node first=list.head;
				list.head=new_node;
				new_node.next=first;
			}
			return list;
		}
		public static LinkedList insertAtPosition(LinkedList list,int data,int pos){
			
			Node new_node=new Node(data);
			new_node.next=null;
			if(list.head==null)
				list.head=new_node;
			else{
				Node temp=list.head;
				int count=0;
				while(temp.next!=null)
				{
                    count++;
					
					
					if(count==pos-1){
					  new_node.next=temp.next;
					  temp.next=new_node;
					  break;
					}
					temp=temp.next;
				}
				
			}
			return list;
		}
		public static LinkedList removeFromPosition(LinkedList list,int pos){
            Node currNode=list.head,prev=null;
			
			if (pos == 0 && currNode != null) { 
            list.head = currNode.next; 
            
           
  
            
            return list; 
			}
            int counter = 0; 
  
			
        while (currNode != null) { 
  
            if (counter == pos) { 
               
                prev.next = currNode.next; 
  
                
               
                break; 
            } 
            else { 
                
                prev = currNode; 
                currNode = currNode.next; 
                counter++; 
            } 
            
		}
		return list;
		}
		public static LinkedList removeFromHead(LinkedList list){
			Node temp=list.head;
			list.head=temp.next;
			temp.next=null;
			return list;
		}
		public static LinkedList removeFromLast(LinkedList list){
			Node last=list.head,prev=null;
			while(last.next!=null){
				prev=last;
				last=last.next;
			}
			prev.next=null;
			return list;
		}
					
					
                  					
		public static void printList(LinkedList list)
		{
			Node currNode=list.head;
			System.out.println("LinkedList: ");
			
			while(currNode!=null){
				System.out.print(currNode.data+" ");
				currNode=currNode.next;
			}
		}
	
}			






