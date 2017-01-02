package $;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


// todo 想 add O（1), get O(n)的方法
// todo 建议重想


public class hs_$170_todo_TwoSum3Datastructuredesign {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        add(1);add(2);add(3);add(4);
        System.out.println(find(5));
    }

    // Add the number to an internal data structure.
    public static void add(int number) {
        if (map.containsKey(number)) map.put(number, map.get(number) + 1);
        else map.put(number, 1);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public static boolean find(int value) {
        Iterator<HashMap.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> cur = it.next();
            int target = value - cur.getKey();
            if (target == cur.getKey() && map.containsKey(target) && map.get(target) >= 2 ||
                    target != cur.getKey() && map.containsKey(target))
                return true;
        }
        return false;
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
