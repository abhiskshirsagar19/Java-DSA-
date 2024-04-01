/*
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.
Return the count of elements.
First and only argument is an array of integers A.
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]
Output 1:
2
Output 2:
1

*/
public class Countnumber {
    public static int countMax(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int maxCount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max) {
                maxCount++;
            }
        }
        return arr.length - maxCount;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 7, 3, 5, 4, 12, 8, 8, 12 };
        System.out.println(countMax(arr));
    }
}