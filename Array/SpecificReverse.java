/*
 * Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2


Example Output
Output 1:

[1, 2, 4, 3]
Output 2:

[6, 5, 2]
*/

public class SpecificReverse {

    public static int[] reverse(int arr[], int start, int end) {
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(reverse(arr, 1, 5));
    }

}
