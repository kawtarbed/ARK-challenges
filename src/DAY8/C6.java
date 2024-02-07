package DAY8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a positive integer: ");
                number = scanner.nextInt();

                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid positive integer.");
                scanner.nextLine();
            }
        }

        System.out.println("You entered: " + number);
        scanner.close();
    }
}

