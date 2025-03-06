
public class nested {

    public static void main(String[] args) {
        int mark = 34;
        if (mark >= 35) {
            System.out.println("pass");
            if (mark >= 80) {
                System.out.println("above 80");
            }
            if (mark == 100) {
                System.out.println("centum");
            }
        } else {
            System.out.println("fail");
            if (mark == 34) {
                mark = mark + 1;
                System.out.println("just pass");
            }
        }

    }
}
