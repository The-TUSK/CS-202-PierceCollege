package _7SeventhWeek;
import java.util.*;

public class SortedStack {
    public static boolean isSorted(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return true;
        }
        Stack<Integer> stack1 = new Stack<>();
        boolean isBigger = true;
        int previous = stack.pop();
        stack1.push(previous);
        while (!stack.isEmpty()) {
            int currentNumber = stack.pop();
            stack1.push(currentNumber);
            if (previous > currentNumber) {
                isBigger = false;
                break;
            }else {
                previous = currentNumber;
            }
        }

        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }

        return isBigger;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(20);
        stack.push(17);
        stack.push(11);
        stack.push(8);
        stack.push(8);
        stack.push(3);
        stack.push(2);

        System.out.println(stack);
        System.out.println(isSorted(stack));
        System.out.println(stack + "\n");


        Stack<Integer> stack1 = new Stack<>();
        stack1.push(18);
        stack1.push(12);
        stack1.push(15);
        stack1.push(6);
        stack1.push(1);

        System.out.println(stack1);
        System.out.println(isSorted(stack1));
        System.out.println(stack1 + "\n");

    }
}
