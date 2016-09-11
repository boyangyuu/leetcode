package dp;

public class d_53_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int maxSubArray(int[] nums) {
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] > 0 ? dp[i - 1] + nums[i] : nums[i]; //bugs1 dp[i]存的是 尾数为 i情况下的最大值
            max = dp[i] > max ? dp[i] : max;
        }

        return max;
    }

    public int maxSubArray1(int[] nums) {
        return 0;
    }
}
/** 题
 *
 * http:
 *
 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 https://discuss.leetcode.com/topic/6413/dp-solution-some-thoughts

 解空间
 f(i) = (以i 为尾数的最大值)
 f(i-1) > 0 : f(i-1) + x[i]
 else       : x[i]

 自底向上
 存解状态 f(i)

 f(1) =
 f(0) > 0 == false => x[1] = 1
 f(2) =
 f(1) > 0 == true => f(1) + x[2] = 1 + -3 = -2
 ...

 f(n)

 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */