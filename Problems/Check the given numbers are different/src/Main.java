import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        boolean result = d1 != d2 && d2 != d3 && d3 != d1;
        System.out.println(result);

    }
}