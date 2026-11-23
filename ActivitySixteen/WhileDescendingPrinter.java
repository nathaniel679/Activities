package ActivitySixteen;

import java.util.Scanner;

public class WhileDescendingPrinter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number Counter Descending");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
        input.close();
    }
}
