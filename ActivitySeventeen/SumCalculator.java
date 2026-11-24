package ActivitySeventeen;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sum Calculator");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        int index = 1;

        while (index <= number) {
            if (index < number) {
                System.out.print(index + " + ");
            } else {
                System.out.print(index);
            }
            sum = sum + index;
            index++;
        }

        System.out.println(" = " + sum);
        System.out.println();
        System.out.println("The sum from 1 to " + number + " is " + sum);
        input.close();
    }
}
