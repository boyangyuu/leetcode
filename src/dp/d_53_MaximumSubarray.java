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

    /*
    可以感觉到 dp[]数组, 每次只用到了 i-1, i 两个数值, 并没有查询以往的数值 是不需要用数组的 改为temp即可
     */
    public int maxSubArray1(int[] nums) {
        //int [] dp = new int[nums.length];
        int temp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = temp > 0 ? temp + nums[i] : nums[i]; //bugs1 dp[i]存的是 尾数为 i情况下的最大值
            max = temp > max ? temp : max;
        }

        return max;
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

todo solution
 https://discuss.leetcode.com/topic/6413/dp-solution-some-thoughts

 todo solution 1
 f(i)  以nums[i] 结尾的 MaxsubArray
 f(i) = {
    if (f(i-1) > 0) f(i-1) + x[i]
    else x[i]
 }



todo bug
 bug1
 bug2
 bug3
 */