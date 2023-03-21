package functions;

import java.util.Scanner;

public class Factorial {
    private int n;

    public static void  main(String[] args) {

        Factorial factorial = new Factorial();
        factorial.input();
        factorial.fact(factorial.n);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
    }

    public void fact(int n) {

        int sum = 1;
        for (int i=1; i <= n; i++) {
            System.out.println("sum=" + sum + ", i=" + i);
            sum = sum * i;
        }
        System.out.println("Final sum=" + sum);
    }
}
