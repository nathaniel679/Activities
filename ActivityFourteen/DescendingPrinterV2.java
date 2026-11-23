package ActivityFourteen;

import java.util.Scanner;

public class DescendingPrinterV2 {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Descending Printer");
    System.out.print("Enter a maximum number: ");
    int maximumNumber = input.nextInt();
    System.out.print("Enter a minimum number: ");
    int minimumNumber = input.nextInt();
    System.out.println();
    if (minimumNumber > maximumNumber){
        System.out.println("Wrong Input, please run again the program.");
    } else if (minimumNumber == maximumNumber) {
        System.err.println("The input has same numbers, please run again the program");
    } else {
    for (int index = maximumNumber; index >= minimumNumber; index--) {
        System.out.println(index);
        if (index == minimumNumber){
            System.out.println("Loop Complete!");
        }
    }
    }   
    input.close();
    }
}
