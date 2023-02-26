package factorial;

import java.util.Scanner;

public class Pronic {

    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        Pronic pronic = new Pronic();
        if (pronic.isPronic(num)) {
            System.out.println(num + " is Pronic");
        } else {
            System.out.println(num + " is NOT Pronic");
        }
    }

    public boolean isPronic(int num) {
        boolean pronic = false;

        int result = 0;
        for (int i=1; result < num; i++) {
            result = i * (i+1);
            if (result == num) {
                pronic = true;
                break;
            }
        }

        return pronic;
    }
}
