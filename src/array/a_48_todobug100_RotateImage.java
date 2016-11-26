package array;


// todo bug!!!! 奇数情况 非常恶心 记住即可!!!
/*
todo bug 1
1 2 3
4 5 6
7 8 9
=>
! 2 3
! 5 6
7 8 9
旋转 1,4 位即可!

todo bug 2
拿1,3,7,9四个点去想, 之后位移时候搞准方向, i,j 每次都变横纵坐标
 */


public class a_48_todobug100_RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = i;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        rotate1(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate1(int[][] matrix) {
        int n = matrix.length;
        int r1 = matrix.length / 2 ,r2 = matrix[0].length / 2;
        if (n % 2 == 1) {
            r1 = matrix.length / 2 + 1;
            r2 = matrix.length / 2;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < r2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
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

todo solution
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


 bug1
 int temp = M1; M1= M2 => 错!

 bug2
 注意奇数行情况不一样!要区别

 bug3
 */