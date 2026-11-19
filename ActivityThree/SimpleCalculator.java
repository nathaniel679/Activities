
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
    
    // Introduction
    System.out.println("                    +-Calculator*/%                           ");
    System.out.println("This calulator calculates two inputs and produces an output...");
    System.out.println();

    // Asks the users for two inputs
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double firstNumber = input.nextDouble();
    
    System.out.print("Enter the second number: ");
    double secondNumber = input.nextDouble();
    System.out.println();

    // Calculations
    double addition = firstNumber + secondNumber;
    double subtraction = firstNumber - secondNumber;
    double multiplication = firstNumber * secondNumber;
    double division = firstNumber / secondNumber;
    double modulo = firstNumber % secondNumber;
    
    // converted to float
    float updatedDivision = (float) division;

    // Printing of results
    System.out.println("Results:");
    System.out.println("Sum: " + addition);
    System.out.println("Difference: " + subtraction);
    System.out.println("Product: " + multiplication);
    System.out.println("Quotient: " + updatedDivision);
    System.out.println("Remainder: " + modulo);
    input.close();
    }
}