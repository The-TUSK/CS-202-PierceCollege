package _4FourthWeek;
import java.util.*;

public class collectionMystery_5 {
    public static void collectionMystery5(ArrayList<String> list1, ArrayList<String> list2) {
        HashMap<String, String> result = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            String s1 = list1.get(i);
            String s2 = list2.get(i);

            if (!result.containsKey(s1)) {
                result.put(s1, s2);
            } else if (!result.containsKey(s2)){
                result.put(s2, s1);
            } else {
                result.put(s1 + s2, s1);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("a", "b", "a", "ab", "ab", "y", "abb"));
        ArrayList<String> list2 = new ArrayList<>(List.of("b", "c", "b", "b", "c", "abb", "y"));
        collectionMystery5(list, list2);

    }
}
