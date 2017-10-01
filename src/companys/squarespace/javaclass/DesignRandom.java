package companys.squarespace.javaclass;

import java.util.*;

/**
 * Created by yuboyang on 8/28/17.
 */
public class DesignRandom {
    private List<Integer> list = new ArrayList<>();
    private HashMap<Integer, Integer> map = new HashMap<>();
    Random random = new Random();
    /** Initialize your data structure here. */
    public DesignRandom() {


    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        int endValue = list.get(list.size() - 1);
        list.set(index, endValue);
        map.put(endValue, index); // todo bug
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
