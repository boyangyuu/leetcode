package dp;



// 12/14 6.42pm: 6.50pm
// todo 快速想出 如何利用 O(1) 空间 取代dp法 (建议转成带语义的, 之后好想些,)


public class d_198_ok_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(rob1(new int[]{0,3,6,4}));
    }

    public static int rob1(int[] nums) {
        if (nums.length == 0) return  0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]); // dp[i-2] 相隔2次迭代
        }
        return dp[nums.length-1];
    }

    public static int rob2(int[] nums) {
        if (nums.length == 0) return  0;
        if (nums.length == 1) return nums[0];
//        int[] dp = new int[nums.length];
        int i0 = nums[0];
        int i1 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int t = i1;
            i1 = Math.max(i0 + nums[i], i1);
            i0 = t;
        }
        return i1;
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