package dp;

import java.util.Arrays;

public class d_338_countBits {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        int target = 4;
        int i = 0, cnt = 0, res = 0;
        while (target != 0) {
            if (target % 2 != 0) res++;
            target = target >> 1;
        }
        System.out.println("res: " + res);
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int num) {
        if (num == 0) return new int[]{0};
        if (num == 1) return new int[]{0, 1};
        int[] res = new int[num + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = res[i / 2];
            } else {
                res[i] = res[i / 2] + 1;
            }
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

