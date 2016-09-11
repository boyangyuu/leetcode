package dp;

public class d_62_UniquePaths {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0)
                    dp[i][j] = 1;  // !!很巧
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths1(int m, int n) {
        int[] dp = new int[m];  //bugs1
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n-1];
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

 思路 :

 f(i,j) = f(i-1,j) + f(i,j-1)
 难点在于选用双重for循环


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */