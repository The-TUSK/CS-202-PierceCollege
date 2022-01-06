package _5FifthWeek;

public class Squares {
    public static int sumOfSquares (int n) {
        if (n == 0) return 0;
        else if (n < 0) throw new IllegalArgumentException();
        return n*n + sumOfSquares(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquares(3));
    }
}
