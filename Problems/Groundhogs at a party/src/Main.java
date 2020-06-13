import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // put your code here
        final int peanuts = scanner.nextInt();
        final boolean isWeekend = scanner.nextBoolean();
        final boolean goodForNormalDays = peanuts >= 10 && peanuts <= 20 && !isWeekend;
        final boolean goodForWeekend = peanuts >= 15 && peanuts <= 25 && isWeekend;

        System.out.println(goodForNormalDays || goodForWeekend);
    }
}