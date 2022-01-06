package _5FifthWeek;

import java.util.*;

public class CountStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String word = input.nextLine();

        while (word.length() > 0) { //OBTAIN VALUES UNTIL EMPTY
            list.add(word);
            System.out.print("Enter String: ");
            word = input.nextLine();
        }
        Map<String, Integer> map = new TreeMap<>();
        for (String value: list) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            }else {
                int oldValue = map.get(value);
                map.put(value, oldValue + 1);
            }
        }
        for (String value: map.keySet()
             ) {
            System.out.println("Entry [" + value + "] has count " + map.get(value));
        }


    }
}
