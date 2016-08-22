package array;

import java.util.ArrayList;
import java.util.List;

public class a_59_SpiralMatrix2 {
    public static void main(String[] args) {
//        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
//        a_59_SpiralMatrix2.spiralOrder(nums);
    }

    public static int[][] generateMatrix(int n) {
        int[][] ret = new int [n][n];
        if(n == 0) return ret;
        int r = n + 1 / 2; // bug4 需要加扣好
        int v = 1;
        //循环圈数
        for (int i = 0; i < r; i++, n-=2) {
            for (int j = i; j < i+n; j++) {
                ret[i][j] = v++;  //固定 纵坐标 i
            }

            for (int j = i + 1; j < i+n; j++){
                ret[j][i+n-1] = v++; //固定横坐标 i + m - 1
            }

            if (n == 1) break;
            for (int j = i+n-2; j >= i; j--) {
                ret[i+n-1][j] = v++;   //固定横坐标 bug2 // m 一定出现在左边 (纵坐标) ,
            }

            for (int j = i+n-2; j >= i + 1; j--) {
                ret[j][i] = v++;
            }

        }


        return ret;
    }

}
/** 题
 *
 * http:https://leetcode.com/problems/spiral-matrix/
 *
 Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 For example,
 Given the following matrix:

 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 spiral 螺旋
 */

/** Solution
 * 时间  空间
 *
 *
 *
 *
 参考网站 https://discuss.leetcode.com/topic/3713/super-simple-and-easy-to-understand-solution/21
 https://discuss.leetcode.com/topic/3713/super-simple-and-easy-to-understand-solution/21
 思路 :

 错误: 创造边界之后搞,

 确定圈数 min(m,n) + 1 / 2




 步骤1
 步骤2
 步骤3

 bug1
 确定边界
 注意 参考网站的颜色区别...每次划线到头

 bug2
 bug3
 */