package ActivityEight;
import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius Converter");
        System.out.print("Enter the temperature in Fahrenheit (°F): ");
        float fahrenheit = input.nextFloat();

        //Convertion of fahrenheit to celsius
        float celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("Temperature in Celsius: " + String.format("%.2f", celsius) + "°C");
        input.close();
    }
}