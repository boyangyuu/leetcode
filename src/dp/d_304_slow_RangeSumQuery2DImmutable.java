package dp;

public class d_304_slow_RangeSumQuery2DImmutable {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static int[][] dp;

    public void NumMatrix(int[][] matrix) {
        if(matrix.length == 0) matrix = new int [1][1]; // todo bug 4
        dp = new int[matrix.length + 1][matrix[0].length + 1]; //todo bug2
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1]; // todo bug1
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ret = 0;
        ret = dp[row2+1][col2+1] - dp[row1][col2+1] - dp[row2+1][col1] + dp[row1][col1]; //todo bug3
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
 dp[r,c] stands for sum 0,0 ends to r,c
 dp[r,c] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];


 f(r1,c1, r, c) = dp[r,c] - dp[r1-1, c] - dp[r, c1-1] + dp[r1-1,c1-1]



 TODO case

 TODO bug

 bug1
  要这样写,才简便

 bug2

 bug3
  注意转换
 todo bug4
   nums为 {} 时 转为 {{0}}
 */