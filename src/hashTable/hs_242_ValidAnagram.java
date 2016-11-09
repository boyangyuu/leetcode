package hashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class hs_242_ValidAnagram {
    public static void main(String[] args) {

        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }

        // set 用法
        HashSet<Integer> set = new HashSet<>();
        for (int v : set){

        }
        String s = "11";
        Character a = s.charAt(0);
//        Character

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                Integer v = map.get(s.charAt(i));
                map.put(s.charAt(i), v.intValue() + 1); //todo bug1
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                Integer v = map.get(t.charAt(i));
                if (v.intValue() == 0) return false;
                map.put(t.charAt(i), v.intValue() - 1); //todo bug1
            } else {
                return false;
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
1个map
优化可以用 int[26]

 TODO case

 TODO bug

 bug1
 v = v.intValue() + 1;  //todo bug1
 map.put(s.charAt(i), v.intValue() + 1); //todo@ bug1

 bug2

 bug3
 */

/*
TODO tutorial


 */
