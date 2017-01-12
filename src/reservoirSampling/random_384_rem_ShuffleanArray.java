package reservoirSampling;

import java.util.Random;

// randomly exchange

public class random_384_rem_ShuffleanArray {
    private int[] nums;
    private Random random = new Random();

    public random_384_rem_ShuffleanArray(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {

        // create a copy
        int[] res = this.nums.clone(); // todo bug 这种属于引用, 会更改的
        for (int i = 0; i < res.length; i++) {

            // generate a random number between 0 and l-1
            int index = this.random.nextInt(res.length); // todo bug nextInt(10) => 0-9

            // swap
            int temp = res[i];
            res[i] = res[index];
            res[index] = temp;
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
