package functions;

import java.util.Scanner;

public class MathFunctions {

    private int count = 0;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your name:");

        String name = myObj.nextLine();  // Read user input
        MathFunctions mf = new MathFunctions();
        System.out.println("Your name to uppercase is: " + mf.changeUpperCase(name));  // Output user input
        System.out.println("Your name to lowercase is: " + mf.changeLowerCase(name));
        System.out.println("Final name: " + name);

        System.out.println("count value before: " + mf.count);
        mf.callByReference(mf);
        System.out.println("count value after: " + mf.count);

    }


    public String changeUpperCase(String s) {

        return s.toUpperCase();
    }

    public String changeLowerCase(String s) { //call/pass by value

        return s.toLowerCase();
    }

    public void callByReference(MathFunctions mf) { //call by reference

       mf.count++;
    }
}
