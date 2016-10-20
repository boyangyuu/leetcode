package design;


import java.util.List;
import java.util.Map;
import java.util.Stack;

public class design_155_MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public static void main(String[] args) {
        List list;Map map;
        Stack<Integer> stack = new Stack<>();

    }

    public design_155_MinStack() {

    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        if (stack.peek() == minStack.peek()) minStack.pop(); //todo bug1 unfixed
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
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
 if (stack.peek() == minStack.peek()) minStack.pop();
 =>
 if (stack.peek() equal minStack.peek()) minStack.pop(); //todo bug1

 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
