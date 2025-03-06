import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a no");
            int num=sc.nextInt();
            boolean isPrime=true;
            if(num<=1){
               isPrime=false;
            }
            else{
                for(int i=2;i<num;i++){
                    if(num % i==0){
                       isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println("prime no");
            }else{
                System.out.println("not a prime no");
            }
        }
    }
    
}
