import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // put your code here
        final int classA = scanner.nextInt();
        final int classB = scanner.nextInt();
        final int classC = scanner.nextInt();

        final int result = (classA / 2 + classA % 2) + (classB / 2 + classB % 2)
                + (classC / 2 + classC % 2);

        System.out.println(result);

    }
}