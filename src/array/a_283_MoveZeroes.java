package array;

public class a_283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int index = i;
                while(true){
                    index++;
                    if(index >= nums.length) {
                        return;
                    }
                    if (nums[index] != 0) {
                        nums[i] = nums[index];
                        nums[index] = 0;
                        break;
                    }
                }
            }
        }
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