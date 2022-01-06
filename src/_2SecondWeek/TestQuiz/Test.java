package _2SecondWeek.TestQuiz;

public class Test {
    public static void main(String[] args) {
        Galileo[] greats = {new Galileo(),  new Newton(), new Einstein(), new Planck()};for (int i = 0; i < greats.length; i++) {System.out.println(greats[i]);greats[i].method1();System.out.println();greats[i].method2();System.out.println();}
    }
}
