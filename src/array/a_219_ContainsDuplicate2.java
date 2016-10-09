package array;

import java.util.HashMap;

public class a_219_ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        boolean ret = false;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                if (i - index <= k) return true;
            }
            map.put(nums[i], i);
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

todo solution


todo bug
 bug1
 bug2
 bug3
 */