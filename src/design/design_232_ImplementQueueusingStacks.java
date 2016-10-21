package design;


import java.util.List;
import java.util.Map;
import java.util.Stack;

public class design_232_ImplementQueueusingStacks {
    public static void main(String[] args) {
        List list;Map map;
        design_232_ImplementQueueusingStacks a = new design_232_ImplementQueueusingStacks();
        a.push(1);
        a.push(2);
        System.out.println(a.peek());
        a.push(3);
        System.out.println(a.peek());
        System.out.println("empty" + a.empty());
    }

    public Stack<Integer> stack = new Stack<>();
    public Stack<Integer> stackTmp = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        stackTmp.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stack.empty()) {
            while (!stackTmp.empty()) stack.push(stackTmp.pop());
        }
        stack.pop();
    }

    // Get the front element.
    public int peek() {
        if (stack.empty()) {
            while (!stackTmp.empty()) stack.push(stackTmp.pop());
        }
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty() && stackTmp.isEmpty();
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
 push O(n)
 处理push 方法 每次push , stack 翻转, 插入新的值


 ######s2######
 两个stack , new old
 pop 从old stack出, 不够时候, new 翻转进old

 偶尔会o(n)

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
