package string;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

// todo 不用code 记下bug就好

public class string_20_b1_ValidParentheses {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        Character[] cleft = {'(', '[', '{'};
        Character[] cright = {')', ']', '}'};
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            boolean isLeft = true;
            int index = 0;
            for (int j = 0; j < cleft.length; j++) {
                if (cur == cleft[j]) {
                    index = j;
                } else if (cur == cright[j]) {
                    isLeft = false;
                    index = j;
                }
            }

            if (isLeft) stack.push(cur);
            else if (stack.size() == 0 || stack.pop() != cleft[index]) return false;
        }
        return stack.size() == 0;//todo bug 1
    }
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

 TODO bug
 bug1
 return true;
 =》
 return stack.size() == 0; // todo bug 1

 case:
 input : "{"
 output : true
 expected : false

 bug2
 bug3
 */




