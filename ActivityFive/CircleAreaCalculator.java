package ActivityFive;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("::Area of the Circle Calculator::");
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = (radius * radius) * Math.PI;

        System.out.println("The area of the circle is: " + area);
        input.close();
    }
}
