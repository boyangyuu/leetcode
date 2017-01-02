package hashTable;

import java.util.HashMap;
import java.util.HashSet;
// todo bug 题意理解缺少
// 12/15 7:31--7:49pm  bug 1


public class hs_205_bug1_IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("eggd", "addg"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "tttle"));

        // todo bug case
        System.out.println(isIsomorphic("aa", "ab")); // todo 1 题干没看清 No two characters may map to the same character
        System.out.println(isIsomorphic("ac", "bb")); // todo 1 题干没说清
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }
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


 TODO solotion
 ######s1######
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
