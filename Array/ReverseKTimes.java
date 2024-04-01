public class ReverseKTimes {
    public static int[] reversekTimes(int A[], int k) {
        int N = A.length;

        k = k % N;

        reverse(A, 0, N - k - 1);
        reverse(A, N - k, N - 1);
        reverse(A, 0, N - 1);

        return A;
    }

    public static void print(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
        }
    }

    public static void reverse(int A[], int s, int e) {
        while (s < e) {
            A[s] = A[s] + A[e];
            A[e] = A[s] - A[e];
            A[s] = A[s] - A[e];
            s++;
            e--;
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        reversekTimes(arr, 2);
        print(arr);

    }
}