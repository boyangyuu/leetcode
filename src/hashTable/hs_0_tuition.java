package hashTable;

import java.util.*;

public class hs_0_tuition {
    public static void main(String[] args) {
        //---------------------map---------------------

        //map 用法 (无法修改元素)
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }

        // 可修改 todo
        Iterator<Map.Entry<Integer, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Boolean> e = it.next();
            if (e.getValue() == false) {
                e.setValue(false);
                it.remove();
            }
        }

        //todo sort
        map.put(1,true);map.put(3,true);map.put(2,true);
        System.out.println("map默认排序:" + map); // 1,2,3 升序

        //todo customize sort
        // set 排序
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1-o2);
            }
        };
        Map<Integer, Integer> map1 = new TreeMap<>(com); //自定义


        //---------------------set---------------------
        //  set 用法 (无法修改元素)
        HashSet<Integer> set = new HashSet<>();
        set.add(1);set.add(3);set.add(2); // todo 默认升序
        System.out.println(set); // 1,2,3


        Set<Integer> set1 = new TreeSet<>(com);
        set1.add(1);set1.add(3);set1.add(2); //
        System.out.println("treeset : " + set1); // 3 2 1

        // map, set 时间复杂度 set is some kinds of map (内部实现机制一样)
        ref : http://stackoverflow.com/questions/16757359/what-is-the-time-complexity-of-hashmap-containsvalue-in-java
        /*
        Search: O(1+k/n)
        Insert: O(1)
        Delete: O(1+k/n)
        containsValue(map) is O(n)
         */
        map.containsValue(false);

        //


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
