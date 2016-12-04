package $;

import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 没看清题意 , 思路不难, 建议找到bug case即可


public class string_161_bug1_OneEditDistance {
    public static void main(String[] args) {
        List list;Map map;Set set;
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




