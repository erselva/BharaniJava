package arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        System.out.println("My Array test");

        //int[] marks = new int[50]; //define
        int marks[]; //creating variable or reference
        marks = new int[5]; //create object
        marks[0] = 90;
        marks[1] = 75;
        marks[2] = 89;
        marks[3] = 98;
        marks[4] = 95;

        //marks[5] = 82;

//        int i = 0;
//        System.out.println("marks[0]=" + marks[i]);
//        i++;
//        System.out.println("marks[1]=" + marks[i]);
//        i++;
//        System.out.println("marks[2]=" + marks[i]);
//        i++;
//        System.out.println("marks[3]=" + marks[i]);
//        i++;
//        System.out.println("marks[4]=" + marks[i]);

        //System.out.println("i=" + i);
        int count=0;
        for (int i=0; i < marks.length; i++) {
            System.out.println("marks[" + i + "]=" + marks[i]);
            if (marks[i] == 98) {
               break;
            }
            //if (marks[i] > 90)
              //  count++;
            //System.out.println("count = " + count);
        }

       // System.out.println("marks[6]=" + marks[6]);


        int[][] students = new int[5][5];
        students[0][0] = 12;


       // for (int i=0; i<5; i++) {
         //   System.out.println("marks[" + i + "]:" + marks[i]);
//        System.out.println("marks[" + 1 + "]:" + marks[1]);
//        System.out.println("marks[" + 2+ "]:" + marks[2]);
//        System.out.println("marks[" + 3 + "]:" + marks[3]);
//        System.out.println("marks[" + 4 + "]:" + marks[4]);
        //}
    }
}
