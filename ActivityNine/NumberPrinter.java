package ActivityNine;

import java.util.Scanner;

public class NumberPrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number Printer");
        System.out.print("Enter a positive integer number: ");
        int number = input.nextInt();
        System.out.println();

        for (int index = 1; index <= number; index++) {
            System.out.println(index);
        }

        input.close();
    }
}
