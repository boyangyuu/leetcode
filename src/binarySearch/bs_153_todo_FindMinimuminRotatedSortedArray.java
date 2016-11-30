package binarySearch;

import java.util.List;
import java.util.Map;
import java.util.Set;

// todo review the solutions and the particular case
public class bs_153_todo_FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        List list;Map map;Set set;

        System.out.println(findMin1(new int[]{3, 4, 5, 6, 7, 0, 1}));

        //todo bug case!!!
        System.out.println(findMin1(new int[]{4, 3}));
    }


    // cleanest code
    public static int findMin2(int[] nums) {
        int i = 0, j = nums.length - 1, min = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;

//            // sub array is sorted
//            if (nums[i] <= nums[j]){
//                min = Math.min(min, nums[i]);
//                break;
//            } else {


            // left side is sorted
            if (nums[mid] >= nums[i]) { // todo bug > => =>
                min = Math.min(min, nums[i]);
                i = mid + 1;
            } else { // right side is sorted
                min = Math.min(min, nums[mid]);
                j = mid - 1;
            }
//            }
        }
        return min;
    }

    public static int findMin1(int[] nums) {
        int i = 0, j = nums.length - 1, min = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;

            // sub array is sorted
            if (nums[i] <= nums[j]){
                min = Math.min(min, nums[i]);
                break;
            } else {
//                 left side is sorted
                if (nums[mid] >= nums[i]) {
                    min = Math.min(min, nums[i]);
                    i = mid + 1;
                } else { // right side is sorted
                    min = Math.min(min, nums[mid]);
                    j = mid - 1;
                }
            }
        }
        return min;
    }




    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left - right) / 2 + right;
            if (nums[left] < nums[right]) {
                 return nums[left];
            } else {
                if (nums[mid] > nums[left]) left = mid + 1;
                else if (nums[mid] < nums[left]) right = mid; //todo bug2
                else return nums[mid]; // todo bug 1
            }
        }
        return -1;
    }


}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
类似 翻折之后的二分查找,
 如下
 if (nums[left] < nums[right]) {

 } else {
 之后每个分支做下处理即可



 TODO case

 TODO bug

 bug1


 bug2
 bug3
 */




