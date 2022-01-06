package _7SeventhWeek;
import java.util.*;

public class SplitAStack {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int number = queue.remove();
            if (number < 0) {
                stack.push(number);
            } else {
                queue.add(number);
            }
        }

        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }
    }
    public static void main(String[] args) {

    }
}
