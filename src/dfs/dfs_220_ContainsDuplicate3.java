package dfs;

import tree.TreeNode;


//
public class dfs_220_ContainsDuplicate3 {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1,6,-1,100,51,6}, 2, 2));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j - i <= k; j++) {
                if (Math.abs(nums[i] - nums[j]) <= t) return true;
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
 todo http://book.51cto.com/art/201405/441260.htm



 TODO solotion


 TODO case

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
