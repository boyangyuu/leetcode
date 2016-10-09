package dp;

public class d_64_MinimumPathSum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int minPathSum(int[][] grid) {
        int ret = 0;
        int r = grid.length,c = grid[0].length;
        int[][] dp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0) dp[i][j] = grid[i][j];
                else if (i == 0) dp[i][j] = dp[i][j-1];
                else if (j == 0) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }

        return dp[r-1][c-1];
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

todo solution
 if (i == 0 && j == 0) dp[i][j] = grid[i][j];
 else if (i == 0) dp[i][j] = dp[i][j-1];
 else if (j == 0) dp[i][j] = dp[i-1][j];
 else dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
todo bug
 bug1
 bug2
 bug3
 */