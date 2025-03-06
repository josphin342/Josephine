public class MirroredRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print space
            }

            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
