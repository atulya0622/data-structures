import java.io.*;
public class StackTester {
    public static void main(String[] args)throws IOException{
        LinkedList list=new LinkedList();
        int data,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your choice\n1.PUSH\n2.POP\n3.PRINT\n4.Size");
        n=Integer.parseInt(br.readLine());
        switch(n){
            case 1:{
                System.out.println("Enter the value\n");
                data=Integer.parseInt(br.readLine());
                 list.insertAtHead(data);
                 System.out.println("Element added successfully\n");
            }
            break;
            case 2:{
                list.removeFromHead();
                System.out.println("Element removed successfully\n");

            }
            break;
            case 3: System.out.println(list);
            break;
            case 4: System.out.println("Size is "+list.size());
                break;
        }
        

    }
}
