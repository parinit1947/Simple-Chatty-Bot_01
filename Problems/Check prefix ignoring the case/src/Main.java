import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String jChar = "j";
        String s = scanner.nextLine().substring(0, 1);
        System.out.println(s.equalsIgnoreCase(jChar));
    }
}