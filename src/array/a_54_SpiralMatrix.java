package array;

import java.util.*;

public class a_54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        a_54_SpiralMatrix.spiralOrder(nums);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<Integer>();

        int il = 0, jl = matrix.length - 1, r = 0;
        int i = 0, j = 0, l = matrix.length;

        int end = l % 2 == 0 ? l / 2 - 1 : (int)Math.floor(l / 2);
        int c = 10;
        while(c-- != 0){
            //out
            System.out.println("ret:" + ret);
            if (i == end && j == end) break;

            //add

            if (i == il){
                if (j < jl) {
                    ret.add(matrix[i][j]);
                    j++;
                    System.out.println("add j: " + j);
                }
                else {
                    il = l - r - 1 - il; // 3 - 0 - 1 = 2

                }
            }
            else if (j == jl) {
                if (i < il) {
                    ret.add(matrix[i][j]);

                    i++;
                    System.out.println("add i: " + i);
                }
                else {
                    jl = r;
                }
            }

            //next round
            if (i == j && i < end){
                r++;
                i++;
                j++;
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
 正确 1,2,3,4 标志位  之后走位
 


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */