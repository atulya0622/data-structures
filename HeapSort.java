public class HeapSort {
    public void heapSort(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp;
            temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp;
            temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public void print(int[] arr,int ch){
        int n=arr.length,i;
        if(ch==1){
            for( i=0;i<n;i++){
                System.out.print(" "+ arr[i]);
            }

        }
        else{
            for( i=n-1;i>=0;i--){
                System.out.print(" "+arr[i]);
            }
        }
    }
    
}
