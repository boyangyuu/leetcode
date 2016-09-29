package dfs;

import tree.TreeNode;

public class dfs_108_ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return  help(nums, 0, nums.length - 1);
    }

    public TreeNode help(int[] nums, int from, int end){
        if (from > end) return null;
        int curIndex = (from - end) / 2 + end; // todo!! 避免溢出
        TreeNode cur = new TreeNode(nums[curIndex]);
        cur.left = help(nums, from, curIndex - 1);
        cur.right = help(nums, curIndex + 1, end);
        return cur;
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
