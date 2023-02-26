package test;

import encapsulation.MyHome;

public class Test {

    public static void main(String[] args) {

        double disc = 100 * (10.0/100.0);
        System.out.println("result = " + disc);

        int n1 = 10;
        int n2 = 100;
        System.out.println("result = " + n1/n2);

       // MyHome myHome = new MyHome();

        //myHome.kitchen();
        System.out.println(pronicNumber(132));
        Test test = new Test();
        test.printTheseNumbersNoOneAskedFor();
    }
    public static boolean pronicNumber(int n){
        for(int i = 0; i < n - 1; i++){
            if(i * (i + 1) == n)
                return true;
        }
        return false;
    }
    public void printTheseNumbersNoOneAskedFor(){
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("1");
            }
            System.out.print("   ");
        }
    }
}
