package $;

import java.util.*;

// todo need code
/*
本题类型里有很多类似题目, 如251等
 */


public class designit_$251_bugscode_Flatten2DVector{
    Queue<Iterator<Integer>> queue;
    Iterator<Integer> current = null;
    public static void main(String[] args) {
        List<List<Integer>> t = new ArrayList<>();
        List<Integer> a = new ArrayList<>();a.add(1);a.add(2);
        t.add(new ArrayList<>(a));t.add(new ArrayList<>(a));
        designit_$251_bugscode_Flatten2DVector c = new designit_$251_bugscode_Flatten2DVector(t);
        while (c.hasNext()) System.out.println(c.next());

        // todo bug case
        // todo {{}} excepted : nothing; output: error
        t.clear();
        t.add(new ArrayList<>());
        c = new designit_$251_bugscode_Flatten2DVector(t);
        while (c.hasNext()) System.out.println(c.next());
    }

    public designit_$251_bugscode_Flatten2DVector(List<List<Integer>> vec2d) {
        queue = new LinkedList<Iterator<Integer>>();
        for (int i = 0; i < vec2d.size(); i++){
            queue.add(vec2d.get(i).iterator());
        }
        current = queue.poll(); // first
    }

    public int next() {
        return current.next();
    }

    public boolean hasNext() {
        if (current == null) return false;

        while (!current.hasNext()) {
            if (!queue.isEmpty()) {
                current = queue.poll();
            } else return false;
        }

        return true;
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