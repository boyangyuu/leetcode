package string;

import java.util.*;

public class string_3_b2_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public int lengthOfLongestSubstring(String s) {
        int res = 0, start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                int breakIndex = map.get(cur);
                start = breakIndex + 1;

                // delete todo bug 1
                Iterator<Map.Entry<Character, Integer>> it =map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Character, Integer> e = it.next();
                    if (e.getValue() <= breakIndex) it.remove();
                }

                map.put(cur, i); // todo bug 2
            } else {
                map.put(cur, i);
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
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
 time: On * 23
 space: 23

 --data structure
 map

 --steps
 record every element in substring and its index
 if element duplicate remove all the elements which index below the current index

 example: eabca...
 currentIndex : 4 currentChar : a
 map : {e:0,a:1,b:2,c:3} remove=> {b:2,c:3} add=> {a:4,b:2,c:3}

 ######s2######
todo 不删除也可以, 直接判断与start的位置关系, 如果containKey 且小于start 则是无用元素,更新其value

 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######


 TODO case

 TODO bug

 bug1
 for (Map.Entry<Character, Integer> : map.entrySet()) //remove // todo bug1 entry遍历的时候 无法修改元素

 =>
 Iterator<Map.Entry<Character, Integer>> it =map.entrySet().iterator();
 while (it.hasNext()) {
 Map.Entry<Character, Integer> e = it.next();
 if (e.getValue() <= breakIndex) it.remove();
 }



 bug2
 //
 =>
 map.put(cur, i); // todo bug 2
 case map : {e:0,a:1,b:2,c:3} remove=> {b:2,c:3} add=> {a:4,b:2,c:3}


 bug3
 */




