package tree;


public class tree_230_KthSmallestElementinaBST {
    public static void main(String[] args) {


    }

    public int kthSmallest(TreeNode root, int k) {
        kthSmallest(root.left, k);
        k--;
        if (k == 0) return root.val;
        kthSmallest(root.right, k);
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

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
