package string;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/*
    todo!!! 记住逻辑bug  用stack On 即可
 */
public class string_32_todo_LongestValidParentheses {
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(longestValidParentheses("()(()"));
    }

    public static int longestValidParentheses(String s) {
        int res = 0, tmp = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                stack.push('(');
            } else {
                if (stack.empty()) tmp = 0;
                else {
                    stack.pop();
                    tmp += 2;
                }
            }
            res = Math.max(res, tmp);
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




