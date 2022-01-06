package _7SeventhWeek;
import java.util.*;

public class FlipHalf {
    public static void flipHalf(Queue<Integer> list) {
        int size = list.size();
        Stack<Integer> list2 = new Stack<>();

        //TAKE ALL THE NUMBERS AT ODD POSITIONS AND PUT INTO STACK
        for (int i = 0; i < size; i++){
            int currentNumber = list.remove();
            if (i % 2 != 0) {
                list2.push(currentNumber);
            }
            list.add(currentNumber);
        }

        //PUT ALL THE NUMBERS AT ODD POSITIONS IN REVERSE ORDER
        for (int i = 0; i < size; i++){
            int currentNumber = list.remove();
            if (i % 2 != 0) {
                list.add(list2.pop());
            } else {
                list.add(currentNumber);
            }
        }

    }

    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>(List.of(1, 8, 7, 2, 9, 18, 12, 0));
        System.out.println(list);
        flipHalf(list);
        System.out.println(list);

    }
}
