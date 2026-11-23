package ActivityFourteen;

import java.util.Scanner;

public class DescendingPrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Descending Printer");
        System.out.print("Enter a maximum number: ");
        int maximumNumber = input.nextInt();
        System.out.print("Enter a minimum number: ");
        int minimumNumber = input.nextInt();
        System.out.println();

        for (int index = maximumNumber; index >= minimumNumber; index--) {
            System.out.println(index);
            if (index == minimumNumber) {
                System.out.println("Loop Complete!");
            }
        }
        input.close();
    }
}
