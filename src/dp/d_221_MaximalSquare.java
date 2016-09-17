package dp;

public class d_221_MaximalSquare {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        int ret = 0;
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if (matrix[i-1][j-1] == '1') dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1; //todo bug1
                ret = Math.max(ret, dp[i][j]);
            }
        }
        return ret * ret;
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
 Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 For example, given the following matrix:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0
 Return 4.

 *
 参考网站
 https://discuss.leetcode.com/topic/20801/extremely-simple-java-solution

 TODO solotion

 将只有1个1 也作为正方形来想


 TODO 重要发现 其实 from 1 <=n 这种写法其实就是为了 方便 当你觉得不方便各种边界的时候 就试试加1

 f(i,j) 以ij 为右下顶点 的最长边长
 0 1
 1 1  =》
 对 f(1, 1) 起决定作用的 是 f(0,1) f(0,0) (1,0) 其中 f(0,0) == 0 最小 所以取f(0,0) 加自身的1
 再将f(0,1) f(0,0) (1,0) 联想为三个矩形解

 1 1 1
 1 1 1
 0 1 1 min(2,1,2) = 1
 1 1 1
 1 1 1
 1 1 1 min(2,1,2) = 2
 TODO case

 TODO bug

 bug1

 bug2
 bug3
 */