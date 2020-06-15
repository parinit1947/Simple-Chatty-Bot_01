import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);

    }
}