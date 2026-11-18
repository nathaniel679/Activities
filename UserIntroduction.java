
import java.util.Scanner;

public class UserIntroduction {

    public static void main(String[] args) {

        System.out.println("\"Welcome to the World of JAVA Programming!\"");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");

        String name = input.nextLine();

        System.out.println("Hello " + name);

    }
}
