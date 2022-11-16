package arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        System.out.println("My Array test");

        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 75;
        marks[2] = 89;
        marks[3] = 98;
        marks[4] = 95;
        //marks[5] = 82;

        for (int i=0; i<5; i++) {
            System.out.println("marks[" + i + "]:" + marks[i]);
//        System.out.println("marks[" + 1 + "]:" + marks[1]);
//        System.out.println("marks[" + 2+ "]:" + marks[2]);
//        System.out.println("marks[" + 3 + "]:" + marks[3]);
//        System.out.println("marks[" + 4 + "]:" + marks[4]);
        }
    }
}
