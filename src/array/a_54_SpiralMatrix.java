package array;

import java.util.*;

public class a_54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        a_54_SpiralMatrix.spiralOrder(nums);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList();
        if(matrix.length == 0 || matrix[0].length == 0) return ret;
        int m = matrix.length, n = matrix[0].length;
        int r = Math.min(m,n) + 1 / 2;

        //循环圈数
        for (int i = 0; i < r; i++, m-=2, n-=2) {
            for (int j = i; j < i+n; j++) //bug1 里面要有i
                ret.add(matrix[i][j]);  //固定 横坐标 i

            for (int j = i + 1; j < i+m; j++)
                ret.add(matrix[j][i+m-1]); //固定纵坐标 i + m - 1

            if (m == 1) break;
            for (int j = i+n-2; j >= i; j--) {
                ret.add(matrix[i+n-1][j]);   //固定横坐标 bug2
            }

            for (int j = i+m-2; j >= i + 1; j--) {
                ret.add(matrix[j][i]);
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