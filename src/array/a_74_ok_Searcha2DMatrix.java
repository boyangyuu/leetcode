package array;

//ok 左下角搜索
public class a_74_ok_Searcha2DMatrix {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int a = 1 / 2;
        System.out.println(a);

        System.out.println(searchMatrix1(new int[][]{{1,4,5,7}, {10,11,12,13}}, 3));
    }

    //best
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] < target) j++;
            else i--;
        }
        return false;
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        // step 1 binary insert
        int left = 0, right = matrix.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[mid][0] <= target) left = mid + 1;
            else right = mid - 1;
        }
        if (right == -1) return false; // todo bug 1

        // step binary search
        int row = right;
        left = 0; right = matrix[row].length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) left = mid + 1;
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

 todo solution
 todo alert!!
 solution 1
 step 1
 二分插入法, 找对应的行
 right指针 最后的位置, 即为第一个 >=target 的位置(可插入)  //todo alert 一定要是right指针
 right 会存在找不到的情况, 会变为-1, if (right == -1) return false; // todo bug 1

 case
 {{1}} , 0

 step 2
 二分查找法 从对应行 二分查找

 solution 2
 一次二分查找法
 如果我们按S型遍历该二维数组，可以得到一个有序的一维数组，那么我们只需要用一次二分查找法，而关键就在于坐标的转
 换，如何把二维坐标和一维坐标转换是关键点，把一个长度为n的一维数组转化为m*n的二维数组(m*n = n)后，那么原一维数
 组中下标为i的元素将出现在二维数组中的[i/n][i%n]的位置，有了这一点，代码很好写出来了


todo bug
 bug1
 //
 =>
 if (right == -1) return false; // todo bug 1
 case :             // todo bug 1
 {{1}} , 0
 expected: false
 output: null point (right == -1)


 bug2
 bug3
 */