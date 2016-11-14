package tree;


public class tree_235_LowestCommonAncestorofaBinarySearchTree {
    public static void main(String[] args) {


    }

    // 前序遍历
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        if (root.val >= min && root.val <= max) return root;
        else if (root.val < min) return lowestCommonAncestor(root.right, p, q);
        else return lowestCommonAncestor(root.left, p, q);
    }

    // 排除法 更好理解
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        if (root.val < min) return lowestCommonAncestor(root.right, p, q);
        else if (root.val > max) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }

    //层序遍历也可


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
 todo 不用想  4为根, 3,7为左右节点的情况, 因为无论前序遍历永远先访问根节点, 4的情况 6节点早已检测过。
 _______6______
 /              \
 ___2__          ___8__
 /      \        /      \
 0      _4       7       9
        /  \
        3   5


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
