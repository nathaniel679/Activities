package ActivitySix;
import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Triangle Area Calculator");
        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        // Calculation of area of triangle
        double area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);
        input.close();
    }
}
