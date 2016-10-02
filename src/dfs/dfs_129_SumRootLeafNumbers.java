package dfs;

import tree.TreeNode;

public class dfs_129_SumRootLeafNumbers {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }


    public int sumNumbers(TreeNode root) {
        return help(root, 0);
    }

    public int help(TreeNode root, int sum) {
        if (root == null) return 0;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) return sum;
        else if (root.left == null) return help(root.right, sum);
        else if (root.right == null) return help(root.left, sum);
        else return help(root.left, sum) + help(root.left, sum);
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
 help(root, sum) {
    if (root.left == null && root.left == null) return sum;
    else if (root.left == null) return sum + help(root.right);
    else if (root.right == null) return sum + help(root.left);
    return help(root.left, sum + v) + help(root.left, sum + v);
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
