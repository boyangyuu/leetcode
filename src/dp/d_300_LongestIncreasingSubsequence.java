package dp;

public class d_300_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int lengthOfLIS(int[] nums) {
        int ret = 0;
        int[] dp = new int[nums.length];
        if (nums.length <= 1) return nums.length;
        dp[0] = 1;   // todo bug1
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) { // 严格递增
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ret = Math.max(dp[i], ret);
        }

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
 对于每一个nums[i]，我们从第一个数再搜索到i，如果发现某个数小于nums[i]，我们更新dp[i]，更新方法为dp[i] = max(dp[i], dp[j] + 1)，即比
 较当前dp[i]的值和那个小于num[i]的数的dp值加1的大小，我们就这样不断的更新dp数组，到最后dp数组中最大的值就是我们要返回的LIS的长


 dp[i] 以 x[i] 为结尾的 最长公共子序列
 其中任何一个 d[j] (0 < j < i) 均有可能与x[i]配对,  检查所有配对的可能性 取最大值此刻需思考
 todo dp[i] =  max(c(dp[i-1], dp[i]), c(dp[i-2],dp[i]),..c(dp[j],) ...dp[0])  参与c的条件是 dp[j] 中的x[j] < x[i]


 TODO case
 dp: 1  2  2  3  4
 x : 1, 9, 2, 4, 6, 5

 TODO bug

 bug1
 bug2
 bug3
 */