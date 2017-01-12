package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class hs_383_ok_RansomNote {
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

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) map.remove(c);
                else map.put(c, map.get(c) - 1);
            }
            if (map.isEmpty()) return true;
        }
        return map.isEmpty();
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int l = ransomNote.length();
        for (Character c : ransomNote.toCharArray()) {
            arr[c - 'a']++;
        }

        for (Character c : magazine.toCharArray()) {
            if (l == 0) return true; // todo can avoid the case, the magazine is very long!
            if (arr[c - 'a'] != 0) {
                arr[c - 'a']--;
                l--;
            }
        }
        return l == 0;
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
