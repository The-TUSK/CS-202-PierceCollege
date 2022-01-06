package _4FourthWeek;
import java.util.*;

public class HappyNumber {
    public static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {  // while the integer does not equal one
            int sum = 0;
            while (n > 0) {   // while n is greater than zero
                sum += (n % 10) * (n % 10);  //keep adding the previous integers
                n /= 10;                     //removes every last digit
            }

            if (seen.contains(sum)) {  // have we seen sum before?
                return false;
            }
            else {
                seen.add(sum);
            }
            n = sum;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("139: " + isHappyNumber(139));
        System.out.println("4: " + isHappyNumber(4));

    }

}
