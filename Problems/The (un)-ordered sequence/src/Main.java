import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastNumber = scanner.nextInt();
        boolean asc = true;
        boolean desc = true;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > lastNumber) {
                desc = false;
                lastNumber = number;
            } else if (number < lastNumber) {
                asc = false;
                lastNumber = number;
            }
        }

        System.out.println(asc || desc);
    }
}