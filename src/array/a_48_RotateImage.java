package array;

public class a_48_RotateImage {
    public static void mains(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int r = n / 2, c = n / 2;
        if (n % 2 == 1) { //bug2
            r = (int)(Math.floor(n / 2) + 1);
            c = (int)(Math.floor(n / 2));
        }
        for(int i = 0; i < r; i++){ // 1
            for (int j = 0; j < c; j++) { // 0
                //System.out.println("i " + i + ", j " + j);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i]; //bug1
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }

}
/** 题
 *
 *
 You are given an n x n 2D matrix representing an image.

 Rotate the image by 90 degrees (clockwise).

 Follow up:
 Could you do this in-place?

 in-place: 就地
 * http:
 *


 */

/** Solution
 * 时间  空间
 *https://leetcode.com/problems/rotate-image/
 *
 *
 参考网站

 思路 :
 总结出公式 [ai, aj] => [aj, a[n-1-i]]
 由于不能有额外空间
 a[i], a[j] => a[j], a[n-1-i] => a[n-i-1], a[n-j-1] => a[n-j-1], a[i] => a[i],a[j] ()


将矩形分为四块
 M1 M2
 M3 M4

 形成环形循环:

 M1   →   M2
 ↑ (奇数)  ↓
 M3   ←   M4
 int temp = M1; M1= M3;M3= M4.. M2= temp(原始M1的值)

 只需要关心M1即可,

注意 奇数行时, 有所不同, 可以根据 i, j 设置

 步骤1
 步骤2
 步骤3

 bug1
 int temp = M1; M1= M2 => 错!

 bug2
 注意奇数行情况不一样!要区别

 bug3
 */