import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle Area Calculator");
        System.out.print("Enter the Length: ");
        float length = input.nextFloat();

        System.out.print("Enter the width: ");
        float width = input.nextFloat();

        //Area Formula
        float area = width * length;

        System.out.println("The area of the rectangle is: " + area);
    }
}
