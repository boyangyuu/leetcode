package array;

public class a_74_Searcha2DMatrix {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int a = 1 / 2;
        System.out.println(a);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int head = 0;
        int tail = matrix.length -1;
        int mid;

        //二分插入
        while(head <= tail){
            mid = (head + tail) / 2;
            int v = matrix[mid][0];
            if (target > v) {

                // 二分插入查找 begin
                if (mid == matrix.length - 1) head = tail;
                else if (target < matrix[mid + 1][0]) head = tail = mid;

                    // 二分查找查找 end

                else {
                    head = mid + 1;  //二分查找的话 只需要这句话
                }

            }
            else if (target < v) tail = mid - 1;
            else {
                return true;
            }
        }

        int r = head;
        head = 0;
        tail = matrix[r].length - 1;
        mid = 0;

        //二分查找
        while(head <= tail){
            mid = (head + tail) / 2;
            int v = matrix[r][mid];
            if (target > v) {
                head = mid + 1;

            }
            else if (target < v) tail = mid - 1;
            else {
                return true;
            }
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
 每行第一个元素, 二分查找,
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