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
        int r = m > n ? (n + 1) / 2 : (m + 1) / 2;
        int p = m, q = n;

        for (int i = 0; i < r; ++i, p -= 2, q -= 2) {
            for (int col = i; col < i + q; ++col)
                ret.add(matrix[i][col]);
            for (int row = i + 1; row < i + p; ++row)
                ret.add(matrix[row][i + q - 1]);

            if (p == 1 || q == 1) break;        //todo bug
            for (int col = i + q - 2; col >= i; --col)
                ret.add(matrix[i + p - 1][col]);
            for (int row = i + p - 2; row > i; --row)
                ret.add(matrix[row][i]);
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
todo solution

 {
    int round =  = (Math.min(m,n) + 1) / 2;
    for {
        4 for // top right below left
    }
    p =  横向边长 , every round -= 2
    q =  纵向边长 , every round -= 2

 }



 错误: 创造边界之后搞,

 确定圈数 min(m,n) + 1 / 2





 bug1
 确定边界
 注意 参考网站的颜色区别...每次划线到头

 bug2
 bug3
 */