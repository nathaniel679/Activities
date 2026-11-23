package ActivityThirteen;

import java.util.Scanner;

public class NumberPrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number Printer");
        System.out.print("Enter a minimum number: ");
        int minimumNumber = input.nextInt();
        System.out.print("Enter a maximum number: ");
        int maximumNumber = input.nextInt();
        System.out.println();

        for (int index = minimumNumber; index <= maximumNumber; index++) {
            System.out.println(index);
        }

        input.close();
    }
}
