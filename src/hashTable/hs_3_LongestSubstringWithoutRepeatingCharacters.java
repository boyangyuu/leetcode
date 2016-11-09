package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class hs_3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
    }

    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap();
        while (j < s.length()) {
            char cur = s.charAt(j);
            if (map.containsKey(cur)) {
                int newi = map.get(cur) + 1;
                for (int k = i; k < newi; k++) map.remove(s.charAt(k));
                i = newi;
                continue;
            } else {
                map.put(cur, j);
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
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
 hashMap add,remove O(n) * 2
 i,j O(n)

 --data--
 hashMap map<Character, Integer> // char and index of this char
 int i // current start
 int j // current end

 1) just clear map if duplicate element and set i,j = the duplicate element index in map

 2) better one , clear elements between i and newi(duplicate element index)
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
