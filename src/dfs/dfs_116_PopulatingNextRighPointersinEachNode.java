package dfs;

import tree.TreeLinkNode;
import tree.TreeNode;

public class dfs_116_PopulatingNextRighPointersinEachNode {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }



    public void connect(TreeLinkNode root) {
        if (root == null) return;
        if (root.left != null) root.left.next = root.right;
        if (root.right != null) root.right.next = root.next == null ? null : root.next.left;
        connect(root.left);
        connect(root.right);
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
 pre order traversal
 step 1
    build next relations between root.left and root.right
 step 2
    build next relations between root.right and root.next.left
 step 3
    recursively the left right node

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
