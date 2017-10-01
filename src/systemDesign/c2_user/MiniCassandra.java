package systemDesign.c2_user;

import java.util.TreeMap;

/**
 * Created by yuboyang on 7/27/17.
 */
public class MiniCassandra {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>((e1, e2)->-e1+e2);
        map.put(3, 3);
        map.put(2, 2);
        map.put(1, 1);
        System.out.println(map);

    }
}
