package ActivityTwelve;

import java.util.Scanner;

public class LargestNumberFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Largest Number Finder");
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The largest number is: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The largest number is: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The largest number is: " + thirdNumber);
        } else if (firstNumber == secondNumber && firstNumber == thirdNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("Two numbers are equal");
        }
    }
}
