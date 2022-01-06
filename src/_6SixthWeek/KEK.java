package _6SixthWeek;

public class KEK {
    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }

    public static void main(String[] args) {
        mystery1(1);
        System.out.println();
        mystery1(2);
        System.out.println();
        mystery1(3);
        System.out.println();
        mystery1(4);
        System.out.println();
        mystery1(16);
    }
}
