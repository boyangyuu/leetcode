package dfs;

import tree.TreeNode;

public class dfs_105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode help(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr || il > ir) return null;

        //get the divide index, divide the inorder to left , right
        int i;
        for (i = il; i <= ir; i++) { //todo bug 1
            if (preorder[pl] == inorder[i]) break;  // cuz the question said they r distinct
        }
        TreeNode root = new TreeNode(preorder[pl]);
        root.left = help(preorder, pl + 1, pl + i - il, inorder, il, i - 1); //i - il means the length of the left due to the divide
        root.right = help(preorder, pl + i - il + 1, pr, inorder, i + 1, ir); //todo bug
        return root;

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
 for (i = pl; i < inorder.length; i++) { //todo bug 1
 for (i = il; i <= ir; i++) { //todo bug 1

 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
