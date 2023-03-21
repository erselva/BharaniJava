package test;

public class Test1 {

    public static void main(String[] args) {

        int i=1;
        while (i < 1) {
            System.out.println("inside while");
            i++;
        }
        i= 1;
        do {
            System.out.println("inside DO while");
            i++;
        } while (i < 1);
    }
}
