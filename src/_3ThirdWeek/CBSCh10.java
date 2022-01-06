package _3ThirdWeek;
import  java.util.*;
public class CBSCh10 {
    public static void main(String[] args) {
        //Add Stars
        System.out.println("Adding stars to an array...");
        ArrayList<String> list = new ArrayList<>(List.of("the", "quick", "brown", "fox"));
        System.out.println(list);
        addStars(list);
        System.out.println(list + "\n");


        //CHECKING IF KEITH NUMBER WOKRS OR NOT
        System.out.println("Checking if input integer is a Keith Number...");
        if (isKeithNumber(19)) {
            System.out.println("It is KiethNumber \n");
        }
        else
            System.out.println("It is not a KiethNumber \n");

        //Finding All Possible Keith Numbers within parameters
        System.out.println("Printing Possible Keith Numbers");
        findKeithNumbers(47, 742);
        System.out.println();
    }



    //---------------------------------------------------------------------------------------addStars
    public static void addStars(ArrayList<String> list) {
        for (int i = 0; i <= list.size(); i+=2)
        {
            list.add(i,"*");
        }
    } //DONE
    //---------------------------------------------------------------------------------------arrayListMystery1
    public static void arrayListMistery1(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            if (n % 10 == 0) {
                v.remove(i);
                v.add(n);
            }
        }
        System.out.println(v);
    } //DONE
    //---------------------------------------------------------------------------------------Switch Pairs
    public static void switchPairs(ArrayList<String> list) {
        for (int i = 0; i <= list.size() - 2; i+=2) {
            String word = list.get(i + 1);
            list.set(i + 1, list.get(i));
            list.set(i, word);
        }
    } //DONE
    //---------------------------------------------------------------------------------------Delete Duplicate
    public static void deleteDuplicates(ArrayList<String> list) {
        if (list.size() > 0) {
            String currentWord = list.get(list.size() - 1);
            for (int i = list.size() - 2 ; i >= 0 ; i--) {
                if (list.get(i).equals(currentWord)) {
                    list.remove(i);
                }else {
                    currentWord = list.get(i);
                }

            }
        }
    } //DONE
    //---------------------------------------------------------------------------------------mirror
    public static void mirror(ArrayList<String> list) {
        if (list.size() > 0) {
            for (int i = 0 ; i < list.size() / 2; i++) {
                list.add(list.get(list.size()- 1 - (i * 2)));
            }
            list.add(list.get(0));  //IDK HOW TO ADD THE LAST NUMBER WITHOUT DOING THIS... :KEK:
        }
    } //DONE
    //---------------------------------------------------------------------------------------countInRange
    public static int countInRange(ArrayList<Integer> v, int minimum, int maximum) {
        if (v.isEmpty()) {
            return 0;
        }
        int contain = 0;
        for (int i = 0; i < v.size(); i++) {
           if (v.get(i) >= minimum && v.get(i) <= maximum) contain++;
        }
        return contain;
    } //DONE
    //---------------------------------------------------------------------------------------Keith Number
    public static Boolean isKeithNumber(int n) {  //DONE
        int finalN = n;
        if (finalN < 10) {
            return true;
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (n > 0) {
            numbers.add(n%10);
            n /= 10;
        }

        for (int i = 0; i < numbers.size()/2 ; i++) {
            int temp = numbers.get(i);
            //          index        value
            numbers.set(    i,       numbers.get(numbers.size() - 1 - i));

            //             index                 value
            numbers.set(numbers.size() - 1 - i,  temp);
        }

        int sum = 0;
        int i = 0;
        while (sum < finalN)
        {
            int addition = 0;
            for (int j = i; j < numbers.size(); j++)
            {
                addition += numbers.get(j);  //ADD THE PREVIOUS FOUR NUMBERS IN THE ARRAY
            }
            numbers.add(addition);  //ADD THE SUM OF THE PREVIOUS FOUR NUMBERS TO THE ARRAY
            sum = addition;         //SET SUM CURRENT NUMBER AS THE SUM OF THE PREVIOUS NUMBERS
            addition = 0;           //RESET THE SUM ADDED TO ZERO
            i++;                    //ADD ONE EVERY LOOP TO CHANGE THE INDEX THAT EACH LOOP STARTS AT

        }

        if (sum == finalN) System.out.println(sum + ": " + numbers);;

        return sum == finalN;
    } //DONE
    //---------------------------------------------------------------------------------------Find Keith Numbers
    public static void findKeithNumbers(int minimum, int maximum) {
        for (int n = minimum; n <= maximum ; n++) {
            int finalN = n;
            int reversedN = n;
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            while (reversedN > 0) {
                numbers.add(reversedN%10);
                reversedN /= 10;
            }
            for (int i = 0; i < numbers.size()/2 ; i++) {
                int temp = numbers.get(i);
                //          index        value
                numbers.set(    i,       numbers.get(numbers.size() - 1 - i));

                //             index                 value
                numbers.set(numbers.size() - 1 - i,  temp);
            }

            int sum = 0;
            int i = 0;
            while (sum < finalN)
            {
                int addition = 0;
                for (int j = i; j < numbers.size(); j++)
                {
                    addition += numbers.get(j);  //ADD THE PREVIOUS FOUR NUMBERS IN THE ARRAY
                }
                numbers.add(addition);  //ADD THE SUM OF THE PREVIOUS FOUR NUMBERS TO THE ARRAY
                sum = addition;         //SET SUM CURRENT NUMBER AS THE SUM OF THE PREVIOUS NUMBERS
                addition = 0;           //RESET THE SUM ADDED TO ZERO
                i++;                    //ADD ONE EVERY LOOP TO CHANGE THE INDEX THAT EACH LOOP STARTS AT

            }
            if (finalN < 10) { numbers.remove(numbers.size() -1);}

            if (sum == finalN) System.out.println(sum + ": " + numbers);
        }
    } //DONE
}
