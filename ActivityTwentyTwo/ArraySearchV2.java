
import java.util.Scanner;

public class ArraySearchV2{
    public static void main(String[] args){

    int[] numbers = {5, 12, 7, 9, 23, 18};
    System.out.print("Enter a number to search: ");
    Scanner input = new Scanner(System.in);
    int numberSearch = input.nextInt();
    boolean isMatched = false;

    for (int index = 0; index < numbers.length; index++){
        if (numberSearch == numbers[index]){
            System.out.println("Number " + numberSearch + " found at index " + index);
            isMatched = true;
        }
    }

    if (isMatched == false){
        System.out.println("Number " + numberSearch + " not found in the array.");
    }
    input.close();
    }
}