package _5FifthWeek;

public class Sequence {
    public static void sequence (int k) {
        if (k <= 0) throw new IllegalArgumentException();
        else if (k == 1) System.out.print(1);
        else if (k % 2 == 0) {
            System.out.print("(" + k + " + ");
            sequence(k-1);
            System.out.print(")");
        }
        else {
            System.out.print("(");
            sequence(k -1);
            System.out.print(" + " + k + ")");
        }
    }
    public static void main(String[] args) {
        sequence(3);
        System.out.println();
        sequence(8);

    }
}
