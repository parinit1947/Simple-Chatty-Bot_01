//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        //how you would do it if you needed to save the other info
        //int age = Integer.parseInt(scan.nextLine());
        //String education = scan.nextLine();
        //int years = Integer.parseInt(scan.nextLine());
        String cuisine = scan.nextLine();

        System.out.printf("The form for %s is completed. We will contact you "
                + "if we need a chef that cooks %s dishes.", name, cuisine);

        scan.close();
    }
}