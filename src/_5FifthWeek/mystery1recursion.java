package _5FifthWeek;

public class mystery1recursion {
    public static void recursionMystery1 (int x, int y) {
        if (y <= 0) {
            System.out.print("0 ");
        } else if (x > y) {
            System.out.print(x + " ");
            recursionMystery1(x - y, y);
        } else {
            recursionMystery1(x, y - x);
            System.out.print(y + " ");
        }
    }

    public static void main(String[] args) {
        recursionMystery1(6, 3);
        System.out.println();
        recursionMystery1(2, 3);
        System.out.println();
        recursionMystery1(5, 8);
        System.out.println();
        recursionMystery1(21, 12);
        System.out.println();
        recursionMystery1(3, 10);
    }

}
