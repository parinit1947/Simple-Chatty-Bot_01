import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final int maximum = new Scanner(System.in).nextInt();

        int counter = 1;
        int square;

        while ((square = counter * counter++) <= maximum) {
            System.out.println(square);
        }
    }
}