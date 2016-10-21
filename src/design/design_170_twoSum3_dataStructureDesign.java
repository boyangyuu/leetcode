package design;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class design_170_twoSum3_dataStructureDesign {
    public Map<Integer, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        List list;Map map;
    }

    public void add(int number) {
        if (map.containsKey(number)) map.put(number, map.get(number) + 1);
        else map.put(number, 1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int target = value - entry.getKey();
            if (target == entry.getKey()) return entry.getValue() > 1;
            else return map.containsKey(target); //todo bug 1
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
 map 里存 数字key: 数字次数value


 find, (target - key)

   todo follow
 map 保存每次查询成功的值 sum key : true

 ######s2######



 ######conclusion######
 todo find方法 频率高的话, 维护结果, add for 遍历 每次设置 map<Sum, TRUE>,
 => find O(1) add O(n)

 todo add方法 频率高的话, 维护数字, map<Number, cnt>
 => add O(1) find O(n)

 TODO case

 TODO bug
 bug1
 else return map.containsKey(target); //todo bug 1
 =>
 else if  map.containsKey(target) return true;

 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
