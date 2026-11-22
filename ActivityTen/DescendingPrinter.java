package ActivityTen;
import java.util.Scanner;

public class DescendingPrinter {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Descending Printer");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println();

        for (int index = 1; index <= number; number--){
            System.out.println(number);
        }
        System.out.println("Loop Complete!");

        input.close();
    }
}