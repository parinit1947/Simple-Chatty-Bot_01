import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        int length = 1;
        int maxLength = 1;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (i > 0 && array[i] > array[i - 1]) {
                length++;
            } else {
                maxLength = Math.max(length, maxLength);
                length = 1;
            }
        }

        System.out.println(Math.max(length, maxLength));
    }
}