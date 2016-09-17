package dp;

public class d_198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 0) return  0;
        int fn_2 = nums[0], fn_1 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        return fn_1;
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

 f(n) = f(n-2) + x[n] selected x[n]
 or f(n) = f(n-1)     unselected x[n]
 select max one



 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */