package ActivityTwentyFour;

import java.util.Scanner;

public class ArrayElementByIndex {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int[] numbers = {10, 20, 30, 40, 50};
    int userInput;

    do { 
    System.out.print("Enter an index (0-4): ");
    userInput = input.nextInt(); 

    if (userInput >= numbers.length) {
        System.out.println("Invalid index! Please enter a number between 0 and 4.");
    }
    } while (userInput >= numbers.length);
    
    System.out.println("The value at index " + userInput + " is: " + numbers[userInput]);
    input.close();
    }
}
