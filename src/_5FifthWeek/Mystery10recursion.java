package _5FifthWeek;

public class Mystery10recursion {
    public static void recursionMystery10(int x) {
        System.out.print(x + " ");
        if (x <= 1) {
            System.out.print("END ");
        } else if (x % 2 == 0) {
            recursionMystery10(x / 2);
            System.out.print("+ ");
        } else {
            System.out.print("[ ");
            recursionMystery10(3 * x + 1);
            System.out.print("] ");
        }
    }

    public static void main(String[] args) {
        recursionMystery10(1);
        recursionMystery10(4);
        recursionMystery10(3);
    }
}
