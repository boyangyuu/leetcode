package dp;

// todo 下次再code一遍, 很快的
public class d_63_todo_UniquePaths2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }








    public static int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if (i == 0 && j == 0) dp[i][j] = 1;
                else if (j == 0) dp[i][j] = dp[i - 1][j];
                else if (i == 0) dp[i][j] = dp[i][j - 1];
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }






    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if (i==0 && j==0) dp[i][j] = obstacleGrid[i][j];  //和uniquePath 相比 其实只是unique 是提前设置好了 0 ?
                else if (j==0) dp[i][j] = dp[i-1][j];  // ? 0 而已 , 而这道题是 需要从 0,0开始算
                else if (i==0) dp[i][j] = dp[i][j-1];
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
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

 需要研究下 一维空间解决的办法!

 f(i,j) = f(i-1,j) + f(i,j-1)
 if i == 0  f(i,j) = f(i, j-1)
else j == 0 。。
 else i,j == 0

todo bug
 bug1
 bug2
 bug3
 */