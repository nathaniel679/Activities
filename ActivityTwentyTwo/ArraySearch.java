package ActivityTwentyTwo;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        int[] numbers = { 5, 12, 7, 9, 23, 18 };

        System.out.println("Array Search");
        System.out.print("Enter a number to search: ");

        Scanner input = new Scanner(System.in);
        int search = input.nextInt();

        for (int index = 0; index <= numbers.length; index++) {
            if (index == numbers.length) {
                System.out.println("Number " + search + " not found in the array.");
                break;
            }
            if (search == numbers[index]) {
                System.out.println("Number " + search + " found at index " + index);
                break;
            }

        }
        input.close();
    }
}
