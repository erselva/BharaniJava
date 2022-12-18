package arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int A[] = {5,3,8,4,9,2,1,12,90,15};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(A);
    }

    public void bubbleSort (int A[]) {

        int i, j, tmp;
        for (i=0; i < 10; i++) {
           for (j=0; j < 10-i-1; j++) {
                if (A[j] > A[j+1]) {
                    tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }

        System.out.println("Array in ascending order is -->");
        for (i=0; i < 10; i++) {
            System.out.print(A[i] + "\t");
        }
    }

}
