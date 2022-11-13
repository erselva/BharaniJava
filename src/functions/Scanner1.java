package functions;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your name:");

        String name = myObj.nextLine();  // Read user input
        System.out.println("Your name is: " + name);  // Output user input
    }
}
