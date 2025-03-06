import java.util.Scanner;
public class mulTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter no");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println(i*5);
            }
        }
    }
    
}
