package array;

public class a_80_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int i = 0, j = 0;
        int c = 0;
        while(j < nums.length){
            if (nums[i] != nums[j]) {
                nums[i] = nums[j];
                c = 1;
                i++;
                j++;
            } else {
                if (c <= 2) {
                    nums[i] = nums[j];
                    i++;
                    j++;
                    c++;
                } else {
                    j++;
                }
            }

        }
        return i + 1;
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

 思路 :


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */