package arrays;

public class ExchangeSort {

    public static void main(String[] args) {

        int A[] = {5,3,8,4,9,2,1,12,90,15};
        ExchangeSort es = new ExchangeSort();
        es.exSelSort(A);

    }

    public void exSelSort (int A[]) {

        int i, j, small, tmp, pos;
        for (i=0; i < 10; i++) {
            small = A[i];
            pos = i;
            for (j=i+1; j < 10; j++) {
                if (A[j] < small) {
                    small = A[j];
                    pos = j;
                }
            }
            tmp = A[i];
            A[i] = A[pos];
            A[pos] = tmp;
        }

        System.out.println("Array in ascending order is -->");
        for (i=0; i < 10; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
