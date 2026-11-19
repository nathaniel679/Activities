
import java.util.Scanner;

public class UserIntroduction {

    public static void main(String[] args) {

        System.out.println("Welcome to the World of Java Programming!");
        System.out.println("Getting to know you...");
        System.out.println("Let's start!");

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.next();

        System.out.print("How about your age? ");
        byte age = input.nextByte();

        System.out.print("What is your favorite hobby? ");
        String hobby = input.next();
        System.out.println();


        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old and love " + hobby + ".");
        input.close();
    }
}
