import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int firstMomentInSeconds = hours1 * 3600 + minutes1 * 60 + seconds1;

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secondtMomentInSeconds = hours2 * 3600 + minutes2 * 60 + seconds2;

        int difference = secondtMomentInSeconds - firstMomentInSeconds;

        System.out.println(difference);
    }
}