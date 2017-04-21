package $;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

// todo 没看清题意 , 思路不难, 建议找到bug case即可


public class string_161_bug1_OneEditDistance {

    public static boolean isValid(String s) {
        char[] cLeft = {'{', '[', '('};
        char[] cRight = {'}', ']', ')'};
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            for (int i = 0; i < cLeft.length; i++) {
                if (c == cLeft[i]) stack.push(c);
            }
            for (int i = 0; i < cRight.length; i++) {
                if (c == cRight[i]) {
                    if (stack.size() == 0) return false;
                    char cur = stack.pop();
                    if (cur != cLeft[i]) return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([aaa]{})"));
        System.out.println(isValid("([aaa{})"));

        List list;Map map;Set set;
        System.out.println(Integer.parseInt("01"));
        System.out.println(isOneEditDistance("ab", "a"));
        System.out.println(isOneEditDistance("ab", "ac"));

        // todo bug case 没看清题意
        System.out.println(isOneEditDistance("ab", "ab")); // expected false
        System.out.println(isOneEditDistance("ab", "abc"));
        System.out.println(isOneEditDistance("bd", "abd"));
    }

    public static boolean isOneEditDistance(String s, String t) {
        if (Math.abs(s.length() - t.length()) >= 2) return false;
        int i = 0, j = 0;
        boolean flag = false;
        while (i < s.length() || j < t.length()) {
            if (i == s.length() || j == t.length()) {
                if (flag) return false;
                else return true;
            } else if (s.charAt(i) == t.charAt(j)) {
                i++;j++;
            } else {
                if (flag) return false;
                if (s.length() > t.length()) i++;
                else if (s.length() < t.length()) j++;
                else {i++;j++;}
                flag = true;
            }
        }
        return flag;
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

 bug2
 bug3
 */




