import java.io.*;
 class LLTester {
    public LinkedList list=new LinkedList();
    public static void main(String args[])
{
	int n;
LinkedList list=new LinkedList();
list.insertAtTail(1);
list.insertAtTail(2);
list.insertAtTail(3);
System.out.println("Insertion at Tail:");
list.printList();
list.insertAtHead(4);
list.insertAtHead(5);
System.out.println("Insertion at Head:");
list.printList();
list.insertAtPosition(6,3);
list.insertAtPosition(7,5);
System.out.println("Insertion at Position:");
list.printList();
list.removeFromLast();
System.out.println("Removal from last:");
list.printList();
list.removeFromHead();
System.out.println("Removal from head:");
list.printList();
list.removeFromPosition(4);

System.out.println("Removal from given position:");
list.printList();




}
}
