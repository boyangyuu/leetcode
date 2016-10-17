package binarySearch;


public class bs_240_Searcha2DMatrix2 {
    public static void main(String[] args) {


    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int i = matrix.length - 1, j = 0;
        // from the left bottom corner to traverse
        while (i >= 0 && j < matrix[0].length) {
            int cur = matrix[i][j];
            if (target > cur) j++;
            else if (target < cur) i--;
            else return true;
        }
        return false;

    }

    //#####s2
    /*
    dp
     */
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
 参考网站


 TODO solotion
 ######s1 ######
 从左下角 或者右上角 遍历

 ######s2 ######
 dp法 f(i,j) = f(i-1, j) || f(i, j - 1)


 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
