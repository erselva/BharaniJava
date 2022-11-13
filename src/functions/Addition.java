package functions;

class Addition {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println("     x value before=" + x);
        System.out.println("     y value before=" + y);

        int result = addNumbers(x,y);

        System.out.println("     x value after=" + x);
        System.out.println("     y value after=" + y);

        System.out.println("result=" + result);

    }

    public static int addNumbers(int a, int b) { //Call by value or Pass by value
        //changing the value of the passed parameters inside the method will not change the original values x and y

        System.out.println("inside addNumbers() method: a value before=" + a);
        System.out.println("inside addNumbers() method: b value before=" + b);

        a++;
        b++;

        a=0;
        b=0;

        System.out.println("inside addNumbers() method: a value after=" + a);
        System.out.println("inside addNumbers() method: b value after=" + b);

        return a + b;
    }
}
