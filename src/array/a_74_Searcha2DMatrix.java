package array;

public class a_74_Searcha2DMatrix {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int a = 1 / 2;
        System.out.println(a);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[mid][0] <= target) left = mid + 1;
            else right = mid - 1;
        }
        return false;

    }

}
/** 题
 *
 * http:https://leetcode.com/problems/search-a-2d-matrix/
 *
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
根据
 1 找对应的行
 每行第一个元素, 二分插入查找,  (详情见 tutorial 里的 binarySearch)
 找到 a[i] <= target < a[i + 1]
 返回 i

 2 从对应行 二分查找
 0,lengh

>= 则 向后搜索
 < 则



 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */