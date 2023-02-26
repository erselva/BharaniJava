package factorial;

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {

        int opt = 0;
        int x = 0;
        Exponential exp = new Exponential();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose an option ");
        System.out.println("1. Display the sum of series ");
        System.out.println("2. Print the series ");
        opt = sc.nextInt();
        switch(opt) {
            case 1:
                System.out.println("Please enter a number: ");
                x = sc.nextInt();
                System.out.println("Result = " + exp.calculate(x));
                break;
            case 2:
//                System.out.println("Please enter a number: ");
//                x = sc.nextInt();
                exp.printSeries();
                break;
            default:
                System.out.println("Sorry wrong option, please select 1");
        }


    }

    public double calculate(int x) {

        //S = 2^1-2^2+2^3; 2-4+8
        double result = 0;
        int rem = 0;
        for (int i = 1; i <= 20; i++) {
            rem = i % 2;
            if (rem > 0) { // odd number
                result = result + Math.pow(x, i);
            } else {
                result = result - Math.pow(x, i);
            }
        }
        return result;
    }

    public void printSeries() {

        for (int i=0; i < 5; i++) {
            for (int j=0; j < i+1; j++) {
                System.out.print("1");
            }
            System.out.print(" ");
        }
    }
}