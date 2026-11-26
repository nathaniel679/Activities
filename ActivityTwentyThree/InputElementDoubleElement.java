package ActivityTwentyThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputElementDoubleElement {
    public static void main(String[] args){
    

    List<Integer> dataInput = new ArrayList<>();
    List<Integer> dataOutput = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int element;

    do{
    System.out.print("How many elements will be input: ");
    element = input.nextInt();
    System.out.println();

    if (element <= 0){
        System.out.println("Invalid Input. Please enter a positive integer!");
    }

    System.out.println();
    } while (element <= 0);
   
    
    for (int index = 0; index < element; index++){
        System.out.print("Enter number for index [" + index + "]: ");
        int number = input.nextInt();
        //Adding values to input
        dataInput.add(number);
        //Adding values to output
        dataOutput.add(dataInput.get(index) * 2);
    }

    System.out.println();
    System.out.println("Test Data:");
    System.out.println("input: " + dataInput);
    System.out.println("output: " + dataOutput);
    input.close();
    }
}
