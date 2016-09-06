package array;

import java.util.HashMap;

public class a_217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return true;
            } else {
                map.put(nums[i], true);
            }
        }
        return false;
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