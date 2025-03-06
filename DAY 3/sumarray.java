import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
         int n=sc.nextInt();    
           int arr []=new int[n];  
           int sum=0;int i;
           for(i=0;i<n;i++){
              arr[i]=sc.nextInt();
              sum+=arr[i];
              
           }
           System.out.println(sum);
      }

     }
    
}
