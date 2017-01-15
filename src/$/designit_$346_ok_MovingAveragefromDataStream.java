package $;

import java.util.*;



public class designit_$346_ok_MovingAveragefromDataStream {
    LinkedList<Integer> queue = new LinkedList<>();
    int cnt = 0;
    int size = 0;
    double sum = 0.0;
    /** Initialize your data structure here. */
    public designit_$346_ok_MovingAveragefromDataStream(int size) {
        this.size = size;
    }

    public double next(int val) {
        if (cnt < size) {
            cnt++;
        } else {
            sum -= queue.pollLast();
        }
        queue.push(val);
        sum += val;
        return sum / cnt;
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