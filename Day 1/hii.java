import java.util.Scanner;
public class hii {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("hello world");
            System.out.println("enter a no");
            a=sc.nextInt();
        }
        System.out.println("you enterted " + a);
    }
}
