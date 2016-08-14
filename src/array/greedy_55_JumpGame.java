package array;

public class greedy_55_JumpGame {
    public static void main(String[] args) {
        int[] nums = {0,2,3};
        System.out.println(greedy_55_JumpGame.canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        boolean ret = false;
        int i = nums.length - 2;
        int w = 0;
        while(i >= 0) {
            if (nums[i] <= w){ // fix bug2 exceed time
                w++;
            } else {
                w = 0; // fix bug1
                //return true; bug1
            }
            i--;
        }

        return w == 0;
    }

}
/** 题
 *
 * http:https://leetcode.com/problems/jump-game/
 *
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.

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

 bug1 中间可能出0 , 导致cannot jump
 bug2 超时 可以减少判断次数  nums[i] <= w || nums[i] == 0 改为  nums[i] <= w
 bug3
 */