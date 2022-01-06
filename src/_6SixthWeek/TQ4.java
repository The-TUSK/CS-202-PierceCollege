package _6SixthWeek;

public class TQ4 {
    public static int oddSum(int n) {
        if (n <= 0) return 0; //return nothing; base case
        if (n % 2 == 0) {     //if it is divisible by two it's even so skip to the next number if needed
            return oddSum(n-1);
        }
        else {
            System.out.println(n + " is an odd number.");
            return n + oddSum(n-1);      // if n is not even, then add it to the next number until 1 == 0.
                                            // 1 is apparently an odd too so we gonna add that too... hopefully it can...
                                            // yes it can... 1 mod 2 is what??
        }

    }
    public static void main(String[] args) {
        System.out.println(oddSum(8) + /*+ " is the final result"*/"/n");



    }
}

//{IGNORE: NOTES}
// 1 is apparently an odd too so we gonna add that too... hopefully it can...
// yes it can... 1 mod 2 is what??
//System.out.println(1%2); == 1... oh wew