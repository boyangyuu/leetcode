package array;

public class a_73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static void setZeroes(int[][] matrix) {
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[0].length; r++) {
                if (matrix[c][r] == 0) {
                    if ( c < matrix.length - 1) {
                        if (0 < c && matrix[c-1][r] == 0 || 0 == c)
                            matrix[c+1][r] = 0;
                    }
                    if (r < matrix[0].length - 1) {
                        if (0 < r && matrix[c][r-1] == 0 || 0 == r)
                            matrix[c][r + 1] = 0;
                    }
                } else {
                    help(matrix, c, r);
                }
            }
        }
    }

    public static void help(int[][] matrix, int c, int r) {
        for (int i = c; i < matrix.length; i++) {
            for (int j = r; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[c][r] = 0;
                    break;
                }

            }
        }
    }

}
/** 题
 *
 * http:
 *

 Set Matrix Zeroes
 Did you use extra space?
 A straight forward solution using O(mn) space is probably a bad idea.
 A simple improvement uses O(m + n) space, but still not the best solution.
 Could you devise a constant space solution?

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 方法1 :
 space : m
 遍历 遇到0时,横向均设置0 , 竖向存变量 boolean 以便下次设置竖方向0

 方法2:
 右下方顺序遍历, 判断该元素是否需要设置为0
 每次比较 只比较右下方的数字, 这样以前设置为0的数字不会干扰

 help(matrix, i, j)
 m = m.length , n = m[1].length
 (0,1) - (0,m)  有0





 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */