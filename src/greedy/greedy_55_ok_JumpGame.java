package greedy;

public class greedy_55_ok_JumpGame {
    public static void main(String[] args) {
        int[] nums = {0,1,3};
//        int[] nums = {2,3,1,1,4};
        System.out.println(canJump1(nums));
    }


    //best solution
    public static boolean canJump1(int[] nums) {
        int j = nums.length, cur = nums.length - 1;
        while (--j >= 0) {
            int distance = cur - j;
            if (nums[j] >= distance) cur = j;
        }
        return cur == 0;
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

todo solution
后面开始 无法跳跃的值 为无效值 无需维护, O(1)


 bug1 中间可能出0 , 导致cannot jump
 bug2 超时 可以减少判断次数  nums[i] <= w || nums[i] == 0 改为  nums[i] <= w
 bug3
 */