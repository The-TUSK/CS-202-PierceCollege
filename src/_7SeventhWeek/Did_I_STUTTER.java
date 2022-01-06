package _7SeventhWeek;

import java.util.Queue;

public class Did_I_STUTTER {
    public static void stutter(Queue<Integer> queue) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int number = queue.remove();
            queue.add(number);
            queue.add(number);
        }
    }
    public static void main(String[] args) {

    }
}
