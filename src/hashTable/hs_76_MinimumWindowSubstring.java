package hashTable;

import java.util.*;

public class hs_76_MinimumWindowSubstring {
    public static void main(String[] args) {

    }

    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        int start = 0;

        List<Character> ans = new ArrayList();
        HashMap<Character, Integer> map = new HashMap<>(); // char:index, and sorted
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), -1);
        }
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if(map.containsKey(curChar)){
                int lastIndex = map.get(curChar);
                map.remove(curChar);
                map.put(curChar, i);
//                ans.set(i, );
            } else {
                map.put(curChar, i);
            }

        }


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


 TODO case

 TODO bug

 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
