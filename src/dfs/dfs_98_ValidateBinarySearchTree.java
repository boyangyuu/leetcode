package dfs;

import org.omg.CORBA.INTERNAL;
import tree.TreeNode;

public class dfs_98_ValidateBinarySearchTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public boolean isValidBST(TreeNode root) {
        return help(root, Long.MAX_VALUE, Long.MIN_VALUE); // TODO bug1
    }

    public boolean help(TreeNode root, long max, long min) {
        if (root == null) return true;
        boolean isValid = root.val < max && root.val > min;
        if (root.left != null) isValid &= help(root.left, root.val, min);
        if (root.right != null) isValid &= help(root.right, max, root.val);
        return isValid;
    }

}
/** 题
 *
 * http:
 *
 Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion
 todo! solution1 bst的每个元素应该满足向下遍历过程中 符合其路径中的所有元素的对比条件

 todo!  2 bst中序遍历 ,存数组, 判断是否有序

 TODO case

 todo!! [10,5,15,null,null,6,20]
     10
    5 15
     6 20
 题干 ,The left subtree of a node contains only nodes with keys less than the node's key.

 TODO follow
 todo#! 有时可以用set 优化map


 TODO bug
 bug1
 return help(root, INTEGER.MAX_VALUE, INT.MIN_VALUE); // TODO bug1 可能 root.val 是max_value,
 return help(root, Long.MAX_VALUE, Long.MIN_VALUE); // TODO bug1
 bug2

 bug3
 */

/*
TODO tutorial


 */
