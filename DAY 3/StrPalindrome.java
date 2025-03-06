import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                System.out.println("palindrome");
                break;
            }
            else{
                System.out.println("not a palindrome");
                break;
            }
   }
        }
}
    
}
