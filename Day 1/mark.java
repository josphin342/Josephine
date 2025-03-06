import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a mark: ");
            m1=sc.nextInt();
            m2=sc.nextInt();
            m3=sc.nextInt();
            m4=sc.nextInt();
            m5=sc.nextInt();
        }
        int total=m1+m2+m3+m4+m5;
        int avg=total / 5;
        System.out.println("total marks:" + total);
        System.out.println("averge marks:" + avg);
        
    }

}

    

