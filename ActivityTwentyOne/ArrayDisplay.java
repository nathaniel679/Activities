package ActivityTwentyOne;

import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.println();
        System.out.println("You entered:");

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
