package _4FourthWeek;

import java.util.*;

public class collectionMystery {
    public static void collectionMystery1 (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            list.remove(i);
            if (n% 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(3,5,8,9,2));
        collectionMystery1(numbers);
    }
}
