package reservoirSampling;
import tree.TreeNode;
import tutorials.ListNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// todo learn reservoir (蓄水池) imaging the given input is extremely large and its length is unknown to u
///https://zh.wikipedia.org/wiki/%E6%B0%B4%E5%A1%98%E6%8A%BD%E6%A8%A3
// todo 学会382 即可

public class random_398_review_RandomPickIndex {
    private int[]nums;
    private Random random = new Random();

    public random_398_review_RandomPickIndex(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        int res = -1;
        int curL = 0;
        int curCount = 0;
        while (curL < this.nums.length) {
            if (nums[curL] == target) {
                curCount++;
                if (random.nextInt(curCount) == 0) res = curL;
            }
            curL++;
        }

        return res;
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
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
