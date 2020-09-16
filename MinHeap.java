public class MinHeap {
    public int Heap[];
    public int size;
    public int maxSize;
    public static int front=1;
    public MinHeap(int max){
        maxSize=max;
        Heap=new int[maxSize+1];
        size=0;
        Heap[0]=Integer.MIN_VALUE;
    }

    public int parent(int pos){
        return pos/2;

    }
    public int LeftChild(int pos){
        return (2*pos);
    }
    public int RightChild(int pos){
        return (2*pos+1);
    }
    public boolean isLeaf(int pos){
        if(pos>=(size/2)&&pos<=size)
        return true;
        else return false; 
    }
    public void swap(int pos1,int pos2){
        int t;
        t=Heap[pos1];
        Heap[pos1]=Heap[pos2];
        Heap[pos2]=t;
    }
    public void minHeapify(int pos){
        if(!isLeaf(pos)){
        if(Heap[pos] > Heap[LeftChild(pos)] || Heap[pos]>Heap[RightChild(pos)]){
            if(Heap[LeftChild(pos)]<Heap[RightChild(pos)]){
                swap(pos,LeftChild(pos));
                minHeapify(LeftChild(pos));
            }
            else{
                swap(pos,RightChild(pos));
                minHeapify(RightChild(pos));
            }
        }
    }
    }
    public void insert(int data){
        if(size>=maxSize)
        return;
        Heap[++size]=data;
        int curr=size;
        while(Heap[curr]<Heap[parent(curr)]){
            swap(curr,parent(curr));
            curr=parent(curr);
        }
    }
    public void print(){
        System.out.println("Heap: ");
        for(int i=1;i<=size;i++){
            System.out.print(Heap[i]+", ");
        }
    }
    public void minheap(){
        for(int i=size/2;i>=1;i--)
        minHeapify(i);
    }
    public int remove(){
        int x=Heap[front];
        Heap[front]=Heap[size--];
        minHeapify(front);
        return x;

    }
    
    
}
