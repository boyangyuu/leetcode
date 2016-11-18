package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 复习下思路 s1 不需要code!

public class string_13_todo_RomantoInteger {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);map.put('V', 5);map.put('X', 10);
        map.put('L', 50);map.put('C', 100);map.put('D', 500);map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            if (i == s.length() - 1) {
                res += map.get(cur);
                continue;
            }
            Character next = s.charAt(i + 1);
            if (map.get(cur) < map.get(next)) res -= map.get(cur);
            else res += map.get(cur);
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
 traverse the string  判断 cur, next
 if cur < next res -= v;
 else res += ;

 --performance
 time: n
 space: 1

 --data structure
 HashMap<Character, Integer> map = new HashMap<>();
 map.put('I', 1);map.put('V', 5);map.put('X', 10);
 map.put('L', 50);map.put('C', 100);map.put('D', 500);map.put('M', 1000);



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




