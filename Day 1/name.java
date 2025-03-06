import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        String n1,n2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter name");
            n1= sc.nextLine();
            n2= sc.nextLine();
        }
        String fullname=n1+n2;
        System.out.println("my name is : " + fullname);
        
    }
    
}
