import java.io.*;
public class QueueUsingLinkedList{
	public static class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
		}
	}
	public static Node front;
	public static Node rear;
	public static void enqueue(int x){
		Node newNode=new Node(x);
		if(rear==null){
			rear=newNode;
			front=rear;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	public static void dequeue(){
		if(front==null){
			System.out.println("The queue is empty");
			return;
		}
		Node temp=front;
		front=front.next;
		if(front==null)
			rear=null;
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
    public static void print(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
		System.out.print("\n");
	}
    public static void main(String[] args){
        int n;
    	System.out.println("Begin\n");
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(50);
		System.out.println("The size of the queue is "+size());
		print();
		dequeue();
		print();
		System.out.println("The size of the queue is "+size());
		dequeue();
		print();
		System.out.println("The size of the queue is "+size());
		System.out.println("End\n");
	}
}
	
		
		
