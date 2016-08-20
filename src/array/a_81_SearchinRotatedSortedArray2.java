package array;

public class a_81_SearchinRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static boolean search(int[] nums, int target) {
        if (nums.length == 0) return false;
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if (nums[m] == target) return true;
            if (nums[m] == nums[r]) {
                r--;
                continue;
            }
            if (nums[m] < nums[r]) { // 右侧必然有序
                if (nums[m] < target && target <= nums[r]) l = m + 1;    //右侧检测
                else r = m - 1; // 排除法 放在左侧
            } else {
                if (nums[l] <= target && target < nums[m]) r = m - 1; // 左侧检测
                else l = m + 1;
            }

        }

        return false;
    }
}
/** 题
 *
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 *
 Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.

 Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?

 Write a function to determine if a given target is in the array.

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 http://www.cnblogs.com/grandyang/p/4325648.html

 注意:
!!!!!!   7　　0　　1　　 2　　4　　5　　6 这种也是可以的!! 是轮转
 思路 :
假想数字往右侧滚动

 规律:
 7　　0　　1　　 2!　　4　　5　　6

 如果中间数 小于最右边, 则 右侧有序(2!　　4　　5　　6) 可以用有序一侧 做排除法!!!! 判断target是否应该在这一侧, 不在的话 自然应该在左侧
 如果中间数 大于最右边, 则 左侧有序 可以用有序一侧 做排除法!!!! 判断target是否应该在这一侧, 不在的话 自然应该在右侧

 注意 中间值 必然在有序的一侧里, 因为使用中间值比较的最右边 ,
 注意 要比较最右边 因为中间值靠左


 这道是之前那道 Search in Rotated Sorted Array 在旋转有序数组中搜索 的延伸，现在数组中允许出现重复数字，这个也会影响我们选择哪半边继续
 搜索，由于之前那道题不存在相同值，我们在比较中间值和最右值时就完全符合之前所说的规律：如果中间的数小于最右边的数，则右半段是有序的，若中间
 数大于最右边数，则左半段是有序的。而如果可以有重复值，就会出现来面两种情况，[3 1 1] 和 [1 1 3 1]，对于这两种情况中间值等于最右值时，目
 标值3既可以在左边又可以在右边，那怎么办么，对于这种情况其实处理非常简单，只要把最右值向左一位即可继续循环，如果还相同则继续移，直到移到不
 同值为止，然后其他部分还采用 Search in Rotated Sorted Array 在旋转有序数组中搜索 中的方法，可以得到代码如下：


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */