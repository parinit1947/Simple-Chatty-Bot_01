import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (-15 < n && n <= 12 || 14 < n && n < 17 || 19 <= n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}