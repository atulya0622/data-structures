import java.io.*;

public class LinkedList{
		public Node head;
		
		public class Node{
			int data;
			Node next;
			
			Node(int d){
				data=d;
				next=null;
			}
		}
		public void insertAtTail(int data){
			Node new_node=new Node(data);
			new_node.next=null;
			
			if(this.head==null)
			{
               this.head=new_node;
			}
			else{
				Node last=this.head;
				while(last.next!=null){
					last=last.next;
				}
				last.next=new_node;
			}
			
		}
		public void insertAtHead(int data){
			Node new_node=new Node(data);
			new_node.next=null;
			if(this.head==null)
				this.head=new_node;
			else{
				Node first=this.head;
				this.head=new_node;
				new_node.next=first;
			}
			
		}
		public void insertAtPosition(int data,int pos){
			
			Node new_node=new Node(data);
			new_node.next=null;
			if(this.head==null)
				this.head=new_node;
			else{
				Node temp=this.head;
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
			 
		}
		public void removeFromPosition(int pos){
            Node currNode=this.head,prev=null;
			
			if (pos == 0 && currNode != null) { 
            this.head = currNode.next; 
            
           
  
            
             
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
		
		}
		public void removeFromHead(){
			Node temp=this.head;
			this.head=temp.next;
			temp.next=null;
			
		}
		public void removeFromLast(){
			Node last=this.head,prev=null;
			while(last.next!=null){
				prev=last;
				last=last.next;
			}
			prev.next=null;
			 
		}
	public static int size(){
		Node temp=front;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
        return count;
	}
					
					
                  					
		public void printList()
		{
			Node currNode=this.head;
			System.out.println("LinkedList: ");
			
			while(currNode!=null){
				System.out.print(currNode.data+" ");
				currNode=currNode.next;
			}
		}
	
				

}
