import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();

        if (army < 1) {
            System.out.println("no army");
        } else if (army < 20) {
            System.out.print("pack");
        } else if (army < 250) {
            System.out.print("throng");
        } else if (army < 1000) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}