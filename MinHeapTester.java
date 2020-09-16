public class MinHeapTester {
    public static void main(String[] args){
        MinHeap min=new MinHeap(10);
        min.insert(2);
        min.insert(1);
        min.insert(7);
        min.insert(5);
        min.insert(10);
        min.insert(22);
        min.insert(12);
        min.insert(15);
        min.insert(4);
        min.minheap();
        min.print();
        System.out.println("The removed element is: " +min.remove());
        min.print();
        System.out.println("The removed element is: "+min.remove());
        min.print();
        System.out.println("The removed element is: "+min.remove());
        min.print();

    }
}
