package $;

import java.util.*;

// todo need code
// 7:00 --
public class design_$251_bugscode_Flatten2DVector implements Iterator<Integer> {
    int r = 0;
    int c = 0;
    List<List<Integer>> vec2d;
    public static void main(String[] args) {
        List<List<Integer>> t = new ArrayList<>();
        List<Integer> a = new ArrayList<>();a.add(1);a.add(2);
        t.add(new ArrayList<>(a));t.add(new ArrayList<>(a));
        design_$251_bugscode_Flatten2DVector c = new design_$251_bugscode_Flatten2DVector(t);
        while (c.hasNext()) System.out.println(c.next());

        // todo bug case
        // todo {{}} excepted : nothing; output: error
        t.clear();
        t.add(new ArrayList<>());
        c = new design_$251_bugscode_Flatten2DVector(t);
        while (c.hasNext()) System.out.println(c.next());
    }

    public design_$251_bugscode_Flatten2DVector(List<List<Integer>> vec2d) {
        this.vec2d = vec2d;
    }

    @Override
    public boolean hasNext() {
        while (vec2d.get(c).size() == 0) r++;
        if (r >= vec2d.size()) return false;
        return true;
    }

    @Override
    public Integer next() {
        int cur = vec2d.get(r).get(c++);
        if (c >= vec2d.get(r).size()) {
            r++;
            c = 0;
        }
        return cur;
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

 TODO follow
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */