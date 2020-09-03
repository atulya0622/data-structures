import java.io.*;
public class StackUsingLinkedList{
       public static class Node{
		          int data;
		          Node next;
		   
		         Node (int d){
			          data=d;
			          next=null;
		          }
	   }
	  public static Node top;
	  
    public static void push(int x){
		         Node newNode=new Node(x);   
		         if(top==null){
				        newNode.next=null;
           
			        }	
			      else {
				      newNode.next=top;
			      }
			top=newNode;
	   }
	   public static void pop(){
		        if(top==null){
			            System.out.println("The Stack is empty\n");
		         }
		        else{
			            top=top.next;
		        }
	    }
		public static void print(Node top) {
			    Node temp=top;
			    while(temp!=null){
				        System.out.print(temp.data+" ");
				        temp=temp.next;
			    }
			    System.out.print("\n");
		}
	public static void main(String[] args) {
        System.out.println("Begin\n");
		    push(10);
	    	push(20);
	    	push(30);
	    	push(50);
	    	print(top);
	    	pop();
	    	print(top);
	    	pop();
	    	print(top);
	      System.out.println("End\n");
}
}
		
