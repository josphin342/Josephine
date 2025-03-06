import java.util.Scanner;
public class sum1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum=0;
            int num=sc.nextInt();
            while(num!=-1){
                sum+=num;
                num=sc.nextInt();
            }
            System.out.println(sum);
        }


    }
    
}
