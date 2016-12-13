package design;


import java.util.*;

// round1 [easy] 12.12 6.19pm-6.43pm = 24m

public class design_155_ok_Minstack1 {
    public static void main(String[] args) {
        List list;Map map;
        design_155_ok_Minstack1 s = new design_155_ok_Minstack1();
        s.push(2);s.push(3);s.push(1);s.push(4);
        System.out.println(s.getMin());
        s.pop();s.pop();
        System.out.println(s.getMin());
    }

    Stack<Integer> s = new Stack<>();
    int min = Integer.MAX_VALUE;

    public design_155_ok_Minstack1() {

    }

    public void push(int x) {
        min = Math.min(min, x);
        s.push(x);
    }

    public void pop() {
        int pop = s.pop();
        if (min == pop) {
            min = Integer.MAX_VALUE;
            Iterator<Integer> it = s.iterator();
            while (it.hasNext()) {
                int cur = it.next();
                min = Math.min(min, cur);
            }
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
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
