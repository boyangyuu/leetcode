package companys.purestorage;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by yuboyang on 9/21/17.    static int check_log_history(String[] events) {
 Stack<Integer> stack = new Stack<>();
 Set<Integer> set = new HashSet<>();
 for (int i = 0; i < events.length; i++) {
 String event = events[i];
 boolean isAcquire = event.split(" ")[0].equals("ACQUIRE");
 int id = Integer.parseInt(event.split(" ")[1]);
 if (isAcquire) {
 if (set.contains(id)) return i + 1;
 else {
 stack.push(id);
 set.add(id);
 }
 }
 else {
 if (stack.isEmpty() || stack.peek() != id) return i + 1;
 int peekId = stack.pop();
 set.remove(peekId);
 }
 }
 return stack.size() == 0 ? 0 : events.length + 1;
 }
 */
public class OA {
    public static void main(String[] args) {
        System.out.println(1);
    }

    static int check_log_history(String[] events) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < events.length; i++) {
            String event = events[i];
            boolean isAcquire = event.split(" ")[0].equals("ACQUIRE");
            int id = Integer.parseInt(event.split(" ")[1]);
            if (isAcquire) {
                if (set.contains(id)) return i + 1;
                else {
                    stack.push(id);
                    set.add(id);
                }
            }
            else {
                if (stack.isEmpty() || stack.peek() != id) return i + 1;
                int peekId = stack.pop();
                set.remove(peekId);
            }
        }
        return stack.size() == 0 ? 0 : events.length + 1;
    }
}
