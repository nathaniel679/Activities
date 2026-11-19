package ActivitySeven;
import java.util.Scanner;

public class OddOrEvenCheckerV2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Odd or Even?");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Using Ternary
        String remarks = number % 2 == 0 ? " is Even." : " is Odd.";
        System.out.println(number + remarks);
        input.close();
    }
}
