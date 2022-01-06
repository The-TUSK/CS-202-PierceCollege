package _9NinthWeek;
import java.util.*;

public class Something {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Queue<String> q = new LinkedList<>();
        s.push("how");
        s.push("are");
        s.push("you");
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
