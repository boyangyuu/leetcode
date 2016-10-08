package binarySearch;


public class bs_0_tutorial {
    public static void main(String[] args) {


    }

    /*
    * 二分查找 , 返回第一个大于等于目标值的数, 没有返回-1
    *
     */

    public int binarySearch(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;

//            if (nums[mid] == nums[r]) { // todo 返回第一个等于target的位置
//                r--;
//                continue;
//            }

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }


        return -1; // todo 等于target的位置
//        return left; // todo 第一个大于等于target的位置, 可能是 length
//        return right; // todo 最后一个小于等于target的位置 可能是 -1;
    }






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
