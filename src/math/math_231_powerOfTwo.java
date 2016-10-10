package math;

import array.Interval;

public class math_231_powerOfTwo {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // todo bug
        String s = Integer.toBinaryString(n); //todo tutorial int convert to binary
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') cnt++;
            if (cnt > 1) return false;
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


 TODO case

 TODO bug

 bug1
 //
 =>
 if (n <= 0) return false; // todo bug
 case n == 0 or -1

 bug2
 bug3
 */

/*
TODO tutorial


 */
