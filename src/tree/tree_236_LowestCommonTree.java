package tree;


import java.util.LinkedList;

public class tree_236_LowestCommonTree {
    public static void main(String[] args) {


    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> listL = new LinkedList<>();
        LinkedList<TreeNode> listR = new LinkedList<>();
        helper(root, p, listL);
        helper(root, q, listR);

        TreeNode res = null;
        while (!listL.isEmpty() && !listR.isEmpty()) {
            TreeNode l = listL.pollLast();
            TreeNode r = listR.pollLast();
            if (l != r) return res;
            res = l;
        }
        return res;
    }

    public boolean helper(TreeNode root, TreeNode target, LinkedList<TreeNode> list) {
        if (root == null) return false;
        if (root == target) {
            list.add(target);
            return true;
        }
        if (helper(root.left, target, list) || helper(root.right, target, list)) {
            list.add(target);
            return true;
        } else return false;
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
 todo!!! https://segmentfault.com/a/1190000003509399

 TODO solotion
 ######s1######

 前序遍历，
 找到left时候， 开始检查后序节点是否为target
 例如6，0
 由于是前序遍历，自然而然会逐个找6 之上的 root节点（5，3），
 先检查5，并标记为在检查状态（check 节点不会变），当访问到尽头时候，扔没有，标记为待检查状态，再检查3节点。

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
