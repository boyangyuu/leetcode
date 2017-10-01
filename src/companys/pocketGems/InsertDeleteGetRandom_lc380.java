package companys.pocketGems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Random;

/**
 * Created by yuboyang on 7/9/17.
 */
public class InsertDeleteGetRandom_lc380 {
    /*然后开始时设计随机数，烙印也给了4个follow up, (暴力设计; 不能使用系统random的设计;
    输出一个长度为k的数组，call之前的method; 给一个无限长的stream, 从stream中随机抽k个数返回这个长度为k的数组)
    最后一个我胡乱写的，写完烙说可以work。然后就挂了。再次吐槽烙印的两面三刀属性。
    */

    HashMap<Integer, Integer> map = new HashMap<>(); // value => index
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    /** Initialize your data structure here. */
    public InsertDeleteGetRandom_lc380() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int v) {
        if (!map.containsKey(v)) return false;
        int index = map.get(v);
        int size = list.size();

        // exchange todo bug 不要忘了, 尾部exchange后, 记得更新map的坐标
        list.set(index, list.get(size - 1));
        map.put(list.get(size - 1), index);

        // remove
        list.remove(size - 1);
        map.remove(v);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);

    }
}



/**
 * 允许重复, 用HashMap<Integer, Set<Integer>> map
 */
class InsertDeleteGetRandom1_lc380 {
    /*然后开始时设计随机数，烙印也给了4个follow up, (暴力设计; 不能使用系统random的设计;
    输出一个长度为k的数组，call之前的method; 给一个无限长的stream, 从stream中随机抽k个数返回这个长度为k的数组)
    最后一个我胡乱写的，写完烙说可以work。然后就挂了。再次吐槽烙印的两面三刀属性。
    */

    HashMap<Integer, Set<Integer>> map = new HashMap<>(); // value => index
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    /** Initialize your data structure here. */
    public InsertDeleteGetRandom1_lc380() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contain = map.containsKey(val);
        if (!contain) map.put(val, new HashSet<>());
        list.add(val);
        return contain;
    }

//    /** Removes a value from the set. Returns true if the set contained the specified element. */
//    public boolean remove(int v) {
//        if (!map.containsKey(v)) return false;
//        Set<Integer> set = map.get(v);
//        int
//        int size = list.size();
//
//        // exchange
//        list.set(index, list.get(size - 1));
//        map.put(list.get(size - 1), index);
//
//        // remove
//        list.remove(size - 1);
//        count.put(v, count.get(v) - 1);
//        if (count.get(v) == 0) map.remove(v);
//        return true;
//    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 *
 *How do you modify your code to allow duplicated number?
 *

 */

/**
 *
 *How do you modify your code to not use build in random?
 *

 */
