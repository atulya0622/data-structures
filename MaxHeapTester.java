public class MaxHeapTester {
    public static void main(String[] args){
        MaxHeap max=new MaxHeap(10);
        max.insert(2);
        max.insert(1);
        max.insert(7);
        max.insert(5);
        max.insert(10);
        max.insert(22);
        max.insert(12);
        max.insert(15);
        max.insert(4);
        max.maxheap();
        max.print();
        System.out.println("The removed element is: " +max.remove());
        max.print();
        System.out.println("The removed element is: "+max.remove());
        max.print();
        System.out.println("The removed element is: "+max.remove());
        max.print();

    }
}
