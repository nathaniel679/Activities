package ActivitySeventeen;

import java.util.Scanner;

public class SumCalculatorForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sum Calculator");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        for (int index = 1; index <= number; index++) {
            if (index < number) {
                System.out.print(index + " + ");
            } else {
                System.out.print(index);
            }
            sum = sum + index;
        }

        /* 
        // REVERSE
        int numberAdder = number;
        int index = 1;
        int sum = 0;

        while (numberAdder >= 1) {
            if (numberAdder > 1) {
                System.out.print(index + " + ");
            } else {
                System.out.print(index);
            }
            sum = sum + numberAdder;
            index++;
            numberAdder--;
        }
         */
        System.out.println(" = " + sum);
        System.out.println();
        System.out.println("The sum from 1 to " + number + " is " + sum);
        input.close();
    }
}
