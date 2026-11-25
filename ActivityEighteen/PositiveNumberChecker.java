package ActivityEighteen;

import java.util.Scanner;

public class PositiveNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Positive Number Checker");
        int number = 0;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number <= 0) {
                System.out.println("Invalid. Please enter a positive number.");
            }
        } while (number <= 0);

        System.out.println("Thank You! You entered: " + number);
        input.close();
    }
}
