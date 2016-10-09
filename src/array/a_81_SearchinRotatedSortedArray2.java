package array;

public class a_81_SearchinRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public boolean search(int[] nums, int target) {
        int rotate = 0; // the first index that cur < next element
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) rotate = i; //todo bug1
        }


        return binarySearch(nums, target, 0, rotate)
                || binarySearch(nums, target, rotate + 1, nums.length - 1);

    }

    public boolean binarySearch(int[] num, int target, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == num[mid]) return true;
            else if (target < num[mid]) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }

    public static boolean search1(int[] nums, int target) {
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


 */

/** Solution
 * 时间  空间

 todo solution 1
 {1,3,1,1,1}
 step 1
 找到 rotate 点 a[1]:3

 step 2
 分别对 a[0:1], a[2:n-1] 二分查找


 todo bug1
 if (nums[i] >= nums[i + 1]) rotate = i; //todo bug1
 =>
 if (nums[i] > nums[i + 1]) rotate = i; //todo bug1
 case {3,3,4,1,1,2,2}
 rotate : 3,
 truely rotate should be 4

 *


todo bug
 bug1
 bug2
 bug3
 */