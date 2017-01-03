package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// todo 稍微复习下思路即可

public class bt_131_slow_PalindromePartitioning {
    public static void main(String[] args) {
        List list;Map map;
        System.out.println(partition("aabaa"));
    }

    public static List<List<String>> partition(String s) {
        List res = new ArrayList();
        help(0, s, new ArrayList<>(), res);
        return res;
    }

    public static void help(int start, String s, List<String> tmp, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);
            if (isPalindrome(sub)) {
                tmp.add(sub);
                help(i + 1, s, tmp, res);
                tmp.remove(tmp.size() - 1);
            }
        }


    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
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


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
