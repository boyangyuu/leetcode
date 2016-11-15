package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class hs_387_FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }
        //  set 用法
        HashSet<Integer> set = new HashSet<>();
        for (int v : set){}
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
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
 time O(2n) sapce O(n)

 --data--
 hashset or hashMap (hashSet is hashMap itself, it implements some interface of hashMap)


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
