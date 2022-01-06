package _3ThirdWeek;
import java.util.*;

public class PurpleProse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("It", "was", "a", "stormy", "night"));
        System.out.println(list.size());

        //Insert two elements
        list.add(3, "dark");
        list.add(4, "and");
        System.out.println(list);

        //REPLACE was
        list.set(1, "IS");
        System.out.println(list);

        //REMOVE ALL CONTAINING a
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("a")) {
                list.remove(i);
            }

        }
        System.out.println(list);
    }

}
