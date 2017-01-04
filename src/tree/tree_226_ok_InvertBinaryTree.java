package tree;


public class tree_226_ok_InvertBinaryTree {
    public static void main(String[] args) {
        //[2,1,3,*,*,*,4] 1层 2; 2层 1,3 ;3层 4
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);root.left = root1;root.right=root3;root3.right=root4;

        root.print();
        invertTree(root);
        root.print();
    }


    public static TreeNode invertTree(TreeNode root) {
        help(root);
        return root;
    }

    public static void help(TreeNode root) {
        if (root == null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        help(root.left);
        help(root.right);
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
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######
 TODO case

 TODO bug
 bug1

 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
