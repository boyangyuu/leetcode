package design;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class design_225_ImplementStackusingQueues {
    public static void main(String[] args) {
        List list;Map map;
        design_225_ImplementStackusingQueues queue = new design_225_ImplementStackusingQueues();
        queue.push(0);
        queue.push(1);
        queue.push(2);
        queue.pop();
        System.out.println(queue.top());

    }

    int top;
    Queue<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        top = x;
    }

    // Removes the element on top of the stack.
    public void pop() {
        for (int i = 0; i < queue.size() - 1; i++) {
            top = queue.poll();
//            System.out.println("top:" + top);
            queue.add(top);
        }
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }

}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion
 ######s1######


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
