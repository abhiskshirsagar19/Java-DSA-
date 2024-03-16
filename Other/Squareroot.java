/*Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Note: A number is a perfect square if its square root is an integer.

Problem Constraints

1 <= A <= 108
Input Format

First and the only argument is an integer A.
Output Format

Return an integer which is the square root of A if A is perfect square otherwise return -1.*/
public class Squareroot {
    public int solve(int num) {
        for (int i = 1; i < 10000; i++) {
            if (i * i == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Squareroot test = new Squareroot();
        System.out.println(test.solve(10));

    }
}
