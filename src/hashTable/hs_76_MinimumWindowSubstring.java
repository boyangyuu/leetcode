package hashTable;

import java.util.*;


// todo 其实本题不是 严格意义的O(n), 2 * O(n) * O(T)
// todo case T contains duplicate elements
// todo 一次遍历 (中间有while) 即可
public class hs_76_MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow1("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow1(String s, String t) {
        int start = -1, cnt = 0;
        int m = 0,n = s.length();
        HashMap<Character, Integer> map = new HashMap<>(); // 一旦都<=0 (cnt == t.l) 则构成solution
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (map.containsKey(key)) map.put(key, map.get(key) + 1);
            else map.put(key, 1);
        }

        for (int i = 0; i < s.length(); i++) {
            //update map
            char c = s.charAt(i);
            if (!map.containsKey(c)) continue;
            if (start == -1) start = i;
            map.put(c, map.get(c) - 1);
            if (map.get(c) >= 0) cnt++;

            //update res
            if (cnt != t.length()) continue;
            if (n - m >= i - start) {
                m = start;
                n = i;
            }

            //next solution
            cnt--;
            map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
            while (true) {
                char startC = s.charAt(++start);
                if (map.containsKey(startC)) {
                    if (map.get(startC) >= 0) {
                        break;
                    } else {
                        map.put(startC, map.get(startC) + 1);
                    }
                }
            }
        }
        return n == s.length() ? "" : s.substring(m, n + 1 - m);
    }


    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;

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

        return "";
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
