
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("enter a char");
            char c=sc.next().charAt(0);
            if(c=='a'||c=='e'|| c=='i'|| c=='o'||c=='u'){
                System.out.println("it is vowel");
            }
            else{
                System.out.println("not a vowel");
            }
        }
    }
    
}
