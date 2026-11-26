package ActivityNineteen;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number Factorial");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        long factorial = 1;

        if (number < 0) {
            System.out.println("Invalid Input! Must be positive integer.");
        } else {
            System.out.print(number + "! = ");
            if (number == 0 || number == 1) {
                System.out.println(factorial);
            } else {
                for (int index = 1; index <= number; index++) {
                    factorial = factorial * index;
                    if (index == number) {
                        System.out.println(index + " = " + factorial);
                    } else {
                        System.out.print(index + " x ");
                    }
                }
            }
        }
        input.close();
    }
}
