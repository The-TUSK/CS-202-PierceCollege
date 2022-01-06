package _3ThirdWeek;

import java.util.*;

public class HashDups {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,2,2,3,4,5,5,5,6));
        System.out.println(arrayList);
        System.out.println(hasDuplicates(arrayList));

        System.out.println(findDuplicates(arrayList));

    }
    public static void printExtras(ArrayList<Integer> input) {

    }

    public static boolean hasDuplicates(ArrayList<Integer> input) {
        HashSet<Integer> temp = new HashSet<>();
        temp.addAll(input);

        return !(temp.size() == input.size());
    }
    public static HashSet<Integer> findDuplicates(ArrayList<Integer> input) {
        HashSet<Integer> temp = new HashSet<>();
        for (Integer number: input) {
            if (temp.add(number)) {
                temp.add(number);
            }
        }
        return temp;
    }

}
