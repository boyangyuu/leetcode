package dfs;

import tree.TreeNode;

public class dfs_111_MinimumDepthoBinaryTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
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
 Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 todo!!! 这里的 leaf node 指当node 左右子树均为null, 而其自身不为null, todocase 中 3 不是, 4,5,6是

 TODO solotion
 当左右子树其中有一个为null, 则递归另一个,
 否则 , 取较小值 + 1,
 f = {
    if (leftChild == null) f(rightChild);
    else if (rightChild == null) f(leftChild);
    else min(f(leftChild), f(rightChild)) + 1
 }



 TODO case

 [1,2,3,4,5,6]
        1
      /  \
     2    3
    / \  /
   4  5 6
 答案为3
      1
    /  \
   2   3
  / \
 4  5
 答案为2

 todo!!

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
