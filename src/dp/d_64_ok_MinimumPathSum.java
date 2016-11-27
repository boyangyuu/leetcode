package dp;

public class d_64_ok_MinimumPathSum {
    public static void main(String[] args) {

        //case 1
        System.out.println(minPathSum1(new int[][]{{1,2}, {3,4}}));
    }


    public static int minPathSum1(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) dp[i][j] = grid[i][j];
                else if (i == 0) dp[i][j] = dp[i][j-1] + grid[i][j];
                else if (j == 0) dp[i][j] = dp[i-1][j] + grid[i][j];
                else dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }











    public int minPathSum(int[][] grid) {
        int r = grid.length,c = grid[0].length;
        int[][] dp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0) dp[i][j] = grid[i][j];
                else if (i == 0) dp[i][j] = dp[i][j-1] + grid[i][j];
                else if (j == 0) dp[i][j] = dp[i-1][j] + grid[i][j];
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
 if (i == 0 && j == 0) dp[i][j] = grid[i][j]; //// todo tutorial 处理边界的方式
 else if (i == 0) dp[i][j] = dp[i][j-1];
 else if (j == 0) dp[i][j] = dp[i-1][j]; // todo tutorial 处理边界的方式
 else dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
todo bug
 bug1
 bug2
 bug3
 */