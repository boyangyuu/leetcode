package string;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/*
    todo 强记思路即可!! 用stack 存左括号的位置 , On 即可
 */
public class string_32_todo_LongestValidParentheses {
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(longestValidParentheses("(()()"));
    }

    public static int longestValidParentheses(String s) {
        int res = 0, start = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                stack.push(i);
            } else {
                if (stack.empty()) start = i + 1; // vaild start update
                else {
                    stack.pop();

                    if (stack.empty()) res = Integer.max(res, i - start + 1); // stack 为空, 合法start 为start变量
                    else {
                        int startV = stack.peek() + 1; // todo stack不为空时, 合法start为堆栈里peek元素(i == 0)的下一个元素
                        res = Integer.max(res, i - startV + 1);
                    }
                }
            }
        }
        return res;
    }

    //todo dp


}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
 ######s1######
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
case1
 "()(()"
 output 4
 excepted 2


 TODO bug

 bug2
 bug3
 */




