package dp;

public class d_303_slow_RangeSumQueryImmutable {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

    }
    private static int[] dp;

    public void NumArray(int[] nums) {
        dp = new int [nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            dp[i] = nums[i-1] + dp[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return dp[j+1] - dp[i];
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
 dp[i] stands for the sum between indices 0 and i
 f (i, j) = dp[i] - dp[j];

 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */