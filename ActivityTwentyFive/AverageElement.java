package ActivityTwentyFive;

import java.util.Scanner;
import java.util.Arrays;

public class AverageElement {
    public static void main(String[] args){

        System.out.println("Average Element in Array");

        Integer[] numbers = new Integer[5];
        Scanner input= new Scanner(System.in);
        int total = 0;

        for(int index = 0; index < numbers.length; index++){
            System.out.print("Enter a number for index [" + index + "]: ");
            numbers[index] = input.nextInt();
            total += numbers[index]; // Adds elements in array
        }

        int average = total / numbers.length; // average elements in array

        System.out.println();
        System.out.println("Test Data:");
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Average: " + average);
        System.out.println();
        input.close();
    }
}
