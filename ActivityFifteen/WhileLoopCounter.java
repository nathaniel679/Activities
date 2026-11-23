package ActivityFifteen;
import java.util.Scanner;

public class WhileLoopCounter {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Number Counter");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int index = 1;
        System.out.println();
        
        while (number >= index) { 
            System.out.println(index);
            index++;
        }
        input.close();
    }
}