package _4FourthWeek;
import java.util.*;

public class UniqueValuesKid {
    public static int numUniqueValues (List<Integer> list) {
        Set<Integer> list2 = new HashSet<>();

        for (Integer number : list) {
            list2.add(number);
        }

        return list2.size();
    }

}
