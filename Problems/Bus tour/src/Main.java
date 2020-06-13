import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        scanner.nextInt();
        int bridgeHeight = scanner.nextInt();
        int crashCount = 0;

        while (scanner.hasNextInt()) {
            if (busHeight >= bridgeHeight) {
                crashCount++;
            }
            if (scanner.hasNextInt())
                bridgeHeight = scanner.nextInt();
        }
        if (crashCount != 0) {
            System.out.println("Will crash on bridge " + crashCount);
        } else {
            System.out.println("Will not crash");
        }
    }
}