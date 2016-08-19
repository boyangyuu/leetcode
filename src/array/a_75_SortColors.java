package array;

public class a_75_SortColors {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


    public static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while(i <= r) {
            // update l
            if(nums[l] == 0) {
                l++;
                i++;
                continue;
            }

            //update r
            if(nums[r] == 2) {
                r--;
                continue;
            }

            //check
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
                continue;
            } else if (nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                continue;
            } else {
                i++;
            }
        }
    }
}
/** 题
 *
 * http:https://leetcode.com/problems/sort-colors/
 *
 Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Note:
 You are not suppose to use the library's sort function for this problem.

 click to show follow up.

 Follow up:
 A rather straight forward solution is a two-pass algorithm using counting sort.
 First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

 Could you come up with an one-pass algorithm using only constant space?

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 1. 排序 (0,1 )和 2 再排序 0, 1 , 再拼接

 2.
 维护 左侧待替换的index 右侧待替换的index
   1 0 1 2 2 1 2 左0 右0
   0 1 1 2 2 1 2 左1 右0 左侧交换并维持左, i不动
   0 1 1 2 2 1 2 左1 右0
   0 1 1 1 2 2 2 左1 右2 右侧交换并维持右, i不动





 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */