package _5FifthWeek;

public class Hanoi {
     public static void hanoi(int numDisk, int startPeg, int endPeg) {
        if (numDisk == 0) {
            return;
        }
        int intermediatePole = 6 - startPeg - endPeg;

        hanoi(numDisk-1, startPeg, intermediatePole);

        System.out.println("move disk " + numDisk + " from peg " + startPeg + " to peg " +endPeg);

        hanoi(numDisk-1, intermediatePole, endPeg);
    }

    public static void main(String[] args) {
        hanoi(3, 1, 3);
    }
}

/*
* hanoi(3, 1, 3)
*   hanoi(2, 1, 2)
*       hanoi(1, 1, 3)
*          hanoi(0, 1, 2)
*           return
*               move disk 1 from 1 to 3
*                   hanoi (0, 1, 3)
*                       return
*                           move disk 2 from peg 1 to peg 2
*                               hanoi(1, 1, 2)
*                                   hanoi (0, 2, 1)
*                                     return
*                                       move disk 1, from peg 3 to peg 2
*                                           hanoi(0, 3, 2)
*                                               return
*
* */