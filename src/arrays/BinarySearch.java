package arrays;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        bs.bSearch(35);
    }

    public void bSearch(int n) {
        int A[] = {5,10,15,20,25,30,35,40,45,50};
        int flag = 0; int L = 0; int M=0; int U = 0;
        L=0;
        U=9;
        while (L <= U) {
          M = (L + U)/2;
          if (n > A[M]) {
              L = M + 1;
          } else {
              if (n < A[M]) {
                  U = M - 1;
              } else {
                  flag = 1;
                  break;
              }
          }
        }

        if (flag == 1) {
            System.out.println("Element found at position " + (M+1));
        } else {
            System.out.println("Element NOT found");
        }
    }
}
