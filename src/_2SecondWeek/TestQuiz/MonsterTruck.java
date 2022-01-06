package _2SecondWeek.TestQuiz;//TimedQuizProb1
//Mark Andrey Rubio
//April 16, 2021

public class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {
        super.m1();
        super.m2();
    }
    public String toString() {
        return "monster " + super.toString();
    }

}
