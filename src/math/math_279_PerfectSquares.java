package math;

public class math_279_PerfectSquares {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1]; //todo bug1
        for (int i = 0; i < n + 1; i++) {
            if (i != 0) dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }

        return dp[n]; // todo bug1
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

 思想 :
 暴力法
 尝试所有的方法, 并取最小值,
 其中会有大量重复运算, 故可以用dp 来避免
 todo tips: u should ask , could I use O(n) space to apply dynamic programming

 dp[i] : the number of perfect square numbers which sum to n , 12 = 4 + 4 + 4, then dp[12] = 3
 dp[i] = min{
    1 + dp[i - 1*1] // because 1*1 + dp[i-1*1]
    1 + dp[i - 2*2] // 2*2 + dp[i-2*2]
    1 + dp[i - 3*3] // 3*3 + dp[i-3*3]
   ..
 }


 TODO case

 TODO bug

 bug1
 int[] dp = new int[n]; // bug1
 =>
 int[] dp = new int[n + 1]; // bug1 int[i] 代表总和为i时, 故应该返回的是dp[n]

 bug2
 bug3
 */

/*
TODO tutorial


 */
