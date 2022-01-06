package _5FifthWeek;
import java.util.*;

public class CountStrings2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String word = input.nextLine();

        while (word.length() > 0) {
            list.add(word);
            System.out.print("Enter String: ");
            word = input.nextLine();
        }
        Set<String> set = new TreeSet<>();

        for (String value: list) {
            set.add(value);
        }
        int count = 0;
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            count = 0;
            for (int i = 0; i < list.size(); i++) {
                String value2 = list.get(i);
                if (value.equals(value2)) {
                    count++;
                }

            }
            System.out.println("Entry [" + value + "] has count " + count);
        }


    }
}
