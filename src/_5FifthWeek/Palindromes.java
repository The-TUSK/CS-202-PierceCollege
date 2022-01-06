package _5FifthWeek;

public class Palindromes {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        else {
            return Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length() - 1)) && isPalindrome(s.substring(1, s.length()-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("John"));
        System.out.println(isPalindrome("RaceCar"));
    }
}
