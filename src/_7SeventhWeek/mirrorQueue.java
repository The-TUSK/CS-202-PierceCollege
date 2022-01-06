package _7SeventhWeek;

import java.util.Queue;
import java.util.Stack;

public class mirrorQueue {
    public static void mirror(Queue<String> queue) {
        Stack<String> stack = new Stack<>();
        int size = queue.size();
        for (int i = 0; i < size; i++){
            String word = queue.remove();
            queue.add(word);
            stack.add(word);
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {

    }
}
