package binarySearch;


public class bs_0_tutorial {
    public static void main(String[] args) {
        System.out.println("第一个小于0的位置" + binarySearchLeft(new int[]{1,2,3}, 0));
        System.out.println("第一个小于3的位置" + binarySearchLeft(new int[]{1,2,3}, 3));

        System.out.println("第一个大于0的位置" + binarySearchRight(new int[]{1,2,3}, 0));
        System.out.println("第一个大于3的位置" + binarySearchRight(new int[]{1,2,3}, 3));
    }

    /*
    * 二分查找 , 返回第一个大于等于目标值的数, 没有返回-1
    *
     */

    public static int binarySearch(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1; // todo 等于target的位置
    }

    // left 第一个小于target的值 (-1: l - 1)
    public static int binarySearchLeft(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return r; //(r是往小了走的)
    }

    // right 第一个大于target的值 (0: l)
    public static int binarySearchRight(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;
        }
        return l; //(l是往大了走的)
    }
}
/** 题
 *



TODO tutorial
 todo 数组优化
    对于已排序的数组问题, 大多数都可以用 二分去优化,

 todo 当数字需要相乘时候, 注意越界
 此时left right mid 均应该转为long
 case 367. Valid Perfect Square

 */
