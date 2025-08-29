public class DAA {
    public static void main(String[] args) {
        int[] A = {5, 2, 4, 6, 1, 3};
        int n = A.length;

       // System.out.println("Before sorting:");
        for (int x = 0; x < n; x++) {
          //  System.out.print(A[x] + " ");
        }
        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }

            A[i + 1] = key;
        }

        System.out.println("\nAfter sorting:");
        for (int x = 0; x < n; x++) {
            System.out.print(A[x] + " ");
        }
    }
}