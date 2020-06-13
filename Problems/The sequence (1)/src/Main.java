import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int times = new Scanner(System.in).nextInt();
        int count = 1;

        if (times == 1) {
            System.out.println(times);
        } else {
            for (int i = 1; i <= times; i++) {
                for (int j = 1; j < times && count <= times; j++) {
                    System.out.print(i + " ");
                    count++;
                    if (i == j) {
                        break;
                    }
                }
            }
        }
    }
}