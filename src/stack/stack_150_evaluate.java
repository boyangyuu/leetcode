package stack;


import java.util.LinkedList;

// r1 12.12 6.00pm:6.13pm
// todo 搞懂Reverse Polish Notation.
public class stack_150_evaluate {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));

    }

    public static int evalRPN(String[] tokens) {
        int i = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        while (i < tokens.length) {
            String cur = tokens[i++];
            if (!(cur.equals("+") || cur.equals("-") || cur.equals("*") || cur.equals("/"))) {
                int t = Integer.parseInt(cur);
                stack.push(t);
                continue;
            }

            int v2 = stack.pop(), v1 = stack.pop();
            if (cur.equals("+")) stack.push(v1 + v2);
            if (cur.equals("-")) stack.push(v1 - v2);
            if (cur.equals("*")) stack.push(v1 * v2);
            if (cur.equals("/")) stack.push(v1 / v2);
        }
        return stack.pop();
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

 逆波兰表达式就是把操作数放前面，把操作符后置的一种写法，我们通过观察可以发现，第一个出现的运算符，
 todo 其前面必有两个数字，当这个运算符和之前两个数字完成运算后从原数组中删去，把得到一个新的数字插入到原来的位置
 ，继续做相同运算，直至整个数组变为一个数字。于是按这种思路写了代码如下：

 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######
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
