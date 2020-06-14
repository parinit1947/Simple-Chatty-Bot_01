import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        fizzBuzz(start, end);
    }

    public static void fizzBuzz(int start, int end) {
        for (; start <= end; start++) {
            if (start % 3 == 0 && start % 5 != 0) {
                System.out.println("Fizz");
            } else if (start % 3 != 0 && start % 5 == 0) {
                System.out.println("Buzz");
            } else if (start % 3 == 0 && start % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(start);
            }
        }
    }
}