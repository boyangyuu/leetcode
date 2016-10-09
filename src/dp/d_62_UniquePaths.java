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
                    dp[i][j] = 1;  // todo solution1 很巧
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths1(int m, int n) {
        /*
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0)
                    dp[i][j] = 1; TODO!!!! 将j去掉,  用过去的dp[i] 表达 dp[i][j-1]
                else
                    TODO 转换法 dp[i][j] (dp[i]) = dp[i-1][j] (dp[i-1])+ dp[i][j-1] (dp[i]);
            }
        }
        return dp[m-1][n-1];
         */

        int[] dp = new int[n];  //bugs1
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

todo solution
 终点为 f(m,n) , TODO 进入终点有两种途径, 从 f(m, n-1) 处, f(m-1,n)处
 故 => f(i,j) = f(i-1,j) + f(i,j-1)
 且边界 为1, 例如 f(i,0) == 1 ,f(0,j) == 1

 structure
 int[][]

 TODO  if (i==0 || j==0) dp[i][j] = 1;


 todo solution 2



todo bug
 bug1
 bug2
 bug3
 */