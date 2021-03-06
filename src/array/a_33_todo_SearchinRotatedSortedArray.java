package array;


// todo 强记 最佳方法 确定有序数组位置 且排除法
// todo bug case {3,1} 3, 1
public class a_33_todo_SearchinRotatedSortedArray {
    public static void main(String[] args) {
        // 1,2,3,3,4,5,6 find first occurence of x, 3, -1,
        System.out.println(searchFirst(new int[]{1,2,3,3,4,5,6}, 3));
        System.out.println(searchFirst(new int[]{3,3,3,3,4,5,6}, 3));
        System.out.println(searchFirst(new int[]{3,3,3,3,3,5,6}, 3));

        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        // case 7
//        System.out.println(search3(new int[]{4,5,6,7,0,1,2}, 0));
//
//        System.out.println(search3(new int[]{3,1}, 1));

//        System.out.println(searchPivot(new int[]{4,5,6,0,0,1,1}, 0));
    }

    /*
    0           6
    1,2,3,3,4,5,6  // 3
     */
    public static int searchFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1; // 6
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                if (mid == 0) return mid;
                else if (arr[mid] == arr[mid - 1]) right = mid - 1;
                else return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return -1;
    }

    //follow up
    /*
    0 1 2 3 4 5
    4 5 6 7 0 1
          ^   ^
     */

    public static int searchPivot(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = j + (i - j) / 2;
            if (nums[i] <= nums[j]) {
                ans = i;
                break;
            } else {
                if (mid == 0 || nums[mid] < nums[mid - 1]) {
                    ans = mid;
                    break;
                } else if (nums[mid] < nums[i]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return ans;
    }

    public static int search3(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) { //todo bug 二分查找法 是<= 不是 <
            int mid = (j - i) / 2 + i;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[i]) { // 左侧有序 // todo bug > => >=, 否则会遗漏
                if (nums[i] <= target && target < nums[mid]) j = mid - 1;
                else i = mid + 1;
            } else { // 右侧必然有序
                if (nums[mid] < target && target<= nums[j]) i = mid + 1;
                else j = mid - 1;
            }
        }
        return -1;
    }



    //神秘方法
    public int search(int[] nums, int target) {
        int rotate = 0; // the first index that cur < next element
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) rotate = i;
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (r - l) / 2 + l;
            if (target == nums[m]) return m;

            if (nums[l] <= nums[r]) { // todo bug 2
                if (target > nums[m]) l = m + 1;
                else r = m - 1;
            } else {
                if (target == nums[l]) return l; // todo bug1
                if (target > nums[l]) r = rotate;
                else l = rotate + 1;
            }

        }

        return -1;

    }


    //排除法
    public static int search1(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if (nums[m] == target) return m;

            if (nums[m] < nums[r]) { // 右侧必然有序
                if (nums[m] < target && target <= nums[r]) l = m + 1;    //右侧检测
                else r = m - 1; // 排除法 放在左侧
            } else {
                if (nums[l] <= target && target < nums[m]) r = m - 1; // 左侧检测
                else l = m + 1;
            }

        }

        return -1;
    }
}
/** 题
 *
 * http:https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.

 */

/** Solution
 * 时间  空间
 *
 *

 todo solution1

 if (nums[m] <= nums[r]) { // 右侧必然有序
   正常二分查找
 else
  if target < mid : l = rotate + 1
  else r = rotate


 todo bug
 bug1
 //
 =>
 if (target == nums[l]) return l; // todo bug1
 case [3,1,5]
 output : -1
 expected : 0

 bug2
 if (nums[l] <= nums[r]) { // todo bug 2
 =>
 if (nums[l] < nums[r]) { // todo bug 2
 case [1] 2
 output : time exceed
 expected : -1

 bug3





 todo solution2 参考网站即可


 注意:
!!!!!!   7　　0　　1　　 2　　4　　5　　6 这种也是可以的!! 是轮转
todo solution
 规律:
 7　　0　　1　　 2!　　4　　5　　6

 如果中间数 小于最右边, 则 右侧有序(2!　　4　　5　　6) 可以用有序一侧 做排除法!!!! 判断target是否应该在这一侧, 不在的话 自然应该在左侧
 如果中间数 大于最右边, 则 左侧有序 可以用有序一侧 做排除法!!!! 判断target是否应该在这一侧, 不在的话 自然应该在右侧

 注意 中间值 必然在有序的一侧里, 因为使用中间值比较的最右边 ,
 注意 要比较最右边 因为中间值靠左


 */