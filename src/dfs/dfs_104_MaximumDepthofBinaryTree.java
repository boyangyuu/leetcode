package dfs;

import tree.TreeNode;

public class dfs_104_MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
            return Math.max(1+maxDepth(root.left), 1+maxDepth(root.right));
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
 maxDepth
 {
    Math.max(maxDepth(l ), maxDepth(r))

 }

 TODO case

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial

    1　　　　　　preorder:　　  1　　2　　3
   / \　　　　　  inorder:　　     2　　1　　3
 2    3　　  　　 postorder:　　 2　　3　　1

 todo!! 递归理解
 preorder[] : {root, left: [root left right], right : [root left right]}
 inorder[]  : {left: [left root right] root right: [left root right]}

so, recursively divide pre and in arrays

help(pre, )
{


}



TODO follow


 */
