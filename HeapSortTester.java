import java.io.*;
public class HeapSortTester {
    public static void main(String[] args) throws IOException{
        HeapSort hs=new HeapSort();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]={20,5,16,4,8,10,9,6,5,2,11};
        hs.heapSort(arr);
        System.out.println("Enter your Choice\n1.Ascending Order\n2.Descending Order");
        int ch=Integer.parseInt(br.readLine());
        hs.print(arr,ch);
    }
}
