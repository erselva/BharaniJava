package functions;

public class SquareRoot {

    public static void main(String[] orgs) {
        double num = 16;
        double result = getSqrt(num); //16 = actual parameter
        System.out.println("Squre root of " + num + " = " + result);
    }

    public static double getSqrt(double number) { //Method Prototype or signature //int number=formal parameter

        //do the calculation
        double sqrtnumber=Math.sqrt(number);

        return sqrtnumber;
    }
}
