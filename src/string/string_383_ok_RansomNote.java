package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_383_ok_RansomNote {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char cur = magazine.charAt(i);
            if (!map.containsKey(cur)) map.put(cur, 1);
            else map.put(cur, map.get(cur) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char cur = ransomNote.charAt(i);
            if (!map.containsKey(cur) || map.get(cur) <= 0) return false;
            else map.put(cur, map.get(cur) - 1);
        }
        return true;
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




