package array;

import java.util.ArrayList;
import java.util.List;

// todo 记住 SpiralMatrix 这个自然会
public class a_59_ok_SpiralMatrix2 {
    public static void main(String[] args) {
        int[][] res = generateMatrix1(3);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix1(int n) {
        int[][] res = new int[n][n];
        if (n == 0) return res;
        int[][] direct = {{0,1}, {1,0}, {0,-1}, {-1, 0}};
        int di = 0, i = 0, j = 0, r = 0, cur = 0;
        while (++cur <= n * n) {
            res[i][j] = cur;

            // range
            int newi = i + direct[di][0];
            int newj = j + direct[di][1];
            if (newi < r || newi > n - 1 - r || newj < r || newj > n - 1 - r) {
                di++;
                newi = i + direct[di][0];
                newj = j + direct[di][1];
            }
            i = newi; j = newj;
            if (i == r && j == r) {
                i = r + 1;
                j = r + 1;
                di = 0;
                r++;
            }
        }
        return res;
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
todo solution

 错误: 创造边界之后搞,

 确定圈数 min(m,n) + 1 / 2





 bug1
 确定边界
 注意 参考网站的颜色区别...每次划线到头

 bug2
 bug3
 */