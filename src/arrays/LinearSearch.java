package arrays;

public class LinearSearch {

    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();
        ls.lSearch(12);
    }

    public void lSearch(int n) {

        int A[] = {5, 3, 8, 4, 9, 2, 1, 12, 90, 15};
        int flag = 0;
        int i = 0;

        for (i = 0; i < A.length; i++) {
            if (n == A[i]) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("number " + n + " found at position " + (i+1));
            int temp = A[i];
            A[i] = A[i-1];
            A[i-1] = temp;
        } else {
            System.out.println("number " + n + " NOT found");
        }
        for (i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
