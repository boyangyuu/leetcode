package dp;

public class d_213_HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int rob(int[] nums) {
        if (nums.length == 2) return Math.max(nums[0], nums[1]); // todo bug1
        if (nums.length == 1) return nums[1];
        if (nums.length == 0) return 0;

        // choose nums[0]
        int fn_2 = nums[0], fn_1 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        int ret = fn_1;

        // not choose nums[0]
        fn_2 = nums[1]; fn_1 = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        ret = Math.max(ret, fn_1);
        return ret;
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

 choose x[0] end to n-1
 not choose x[0] end t0 n


 TODO case

 TODO bug

 bug1 别忘了 首尾可以选1个的

 bug2
 bug3
 */