package array;

public class a_73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static void setZeroes(int[][] matrix) {
        // 0 record row 1 whether contains 0
        boolean isContains0InR1 = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) isContains0InR1 = true;
        }

        boolean isContains0InC1 = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) isContains0InC1 = true;
        }

        // 1 store
        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    // all nums in this row set 0
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        // 2 handle 垂直              // bug1
        for (int c = 1; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][c] = 0;
                }
            }
        }

        for (int r = 1; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                for (int i = 1; i < matrix[0].length; i++) {
                    matrix[r][i] = 0;
                }
            }
        }

        // 3 handle row 1 , column 1
        if (isContains0InR1) {
            for (int i = 0; i < matrix[0].length; i++)  matrix[0][i] = 0;
        }

        if (isContains0InC1) {
            for (int i = 0; i < matrix.length; i++) matrix[i][0] = 0;
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

todo solution
 方法1 :
 space : m + n
 矩形外, 分别存 水平 垂直方向 是否置0

 方法2: (不行)
 右下方顺序遍历, 判断该元素是否需要设置为0
 每次比较 只比较右下方的数字, 这样以前设置为0的数字不会干扰

 help(matrix, i, j)
 m = m.length , n = m[1].length
 (0,1) - (0,m)  有0

方法3
 建立在方法1上
 0. 记录第一行, 第一列是否有0

 1. 从2行2列 遍历所有元素
 存起来(第一行第一列)

 2. 根据第一行第一列 分别处理数据 垂直, 水平数据 (注意from 1)


 3. 根据步骤0 处理第一行第一列



todo bug
 bug1
 bug2
 bug3
 */