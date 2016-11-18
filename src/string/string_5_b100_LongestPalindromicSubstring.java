package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_5_b100_LongestPalindromicSubstring {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        String res = "" + s.charAt(0);
        for (int i = 1; i < s.length() - 1; i++) {
            String s1 = help(i, i, s);
            String s2 = help(i, i + 1, s);
            if (s1.length() > res.length()) res = s1;
            if (s2.length() > res.length()) res = s2;

        }
        return res;
    }

    public String help(int start, int start1, String s) {
        if (s.charAt(start) != s.charAt(start1)) return ""; //todo bug 1
        while (true) {
            if (start <= 0 || start1 >= s.length() - 1) break; // todo bug 2
            if (s.charAt(start - 1) != s.charAt(start1 + 1)) break;
            start--;start1++;
        }
        return s.substring(start, start1 + 1);
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
 ######s2######
 traverse every element and use it as the middle part of palindromic
 public String help(int start, int start1, String s) {
 返回 符合条件的string


 --performance

 time: On square
 space:

 --data structure

 --steps


 ######s1######
 todo dp solution ? 题解
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




