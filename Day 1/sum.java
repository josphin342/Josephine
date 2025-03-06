import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int n1,n2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a no:");
            n1=sc.nextInt();
            n2=sc.nextInt();
        }
        System.out.println(n1+n2);      
    }
    
}
