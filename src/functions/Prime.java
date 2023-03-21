package functions;

import java.util.Scanner;

public class Prime {
    private int n;

    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.input();
        prime.checkPrime(prime.getN());
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
    }

    public void checkPrime(int n) {
        boolean primeNumber = false;
        for (int i=2; i < n; i++) {
            if ((n % i) == 0) {
                primeNumber = false;
                System.out.println(n + " not a Prime number");
                break;
            } else {
                primeNumber = true;
            }
        }
        if (primeNumber) {
            System.out.println(n + " a Prime number");
        }
    }


}
