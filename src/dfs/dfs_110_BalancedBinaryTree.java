package dfs;

import tree.TreeNode;

public class dfs_110_BalancedBinaryTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public boolean isBalanced(TreeNode root) {
        int deep = getMaxDepth(root);
        if (deep == -1) return false;
        else return true;
    }

    public int getMaxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = getMaxDepth(root.left);
        if (left == -1) return -1;
        int right = getMaxDepth(root.right);
        if (right == -1) return -1;

        if (Math.abs((left - right)) > 1) return -1; //todo!! sov1
        return Math.max(left, right) + 1;
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

 在计算deep的时候
 每个节点的 左右子树深度 相差不超过 1

 基于 maxDepth dfs__104 题去做


 TODO solotion
 getMaxDeepth
 {
    leftDeep = f(left);

    leftDeep = f(left);

    if abs(leftDeep, rightDeep) > 1 return -1;
    return 1 + max(left, right);
 }


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
