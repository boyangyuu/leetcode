package design;


import java.util.List;
import java.util.Map;
import java.util.Stack;

//todo 想出方法 所有操作都是O(1) , 最佳思路!!!, 建议复习思路 !!



public class design_155_todo_MinStack {



















    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public static void main(String[] args) {
        List list;Map map;
        Stack<Integer> stack = new Stack<>();

        // bug case
        design_155_todo_MinStack s = new design_155_todo_MinStack();
        s.push(512);s.push(-1024);s.push(-1024);s.push(512);
//        System.out.println(s.getMin());
        s.pop();s.pop();s.pop();
        System.out.println(s.getMin());
    }

    public design_155_todo_MinStack() {

    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        if (stack.peek() == minStack.peek()) {
            minStack.pop(); //todo bug1 unfixed
        }
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
 建立minStack, minStack 是stack 的一小部分copy,
 1,2,1,2
 1


 ######s1######


 ######s2######

 TODO case

 TODO bug
 todo bug1 Integer 与Integer 相比较时候 不会比较value
 if (stack.peek() == minStack.peek()) minStack.pop();
 =>
 if (stack.peek() equal minStack.peek()) minStack.pop(); //todo bug1!!!!!
 or if (stack.peek().intValue() ==  minStack.peek()..) minStack.pop(); //todo bug1!!!!!

 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
