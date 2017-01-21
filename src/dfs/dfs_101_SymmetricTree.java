package dfs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class dfs_101_SymmetricTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
        List<Integer> list = new ArrayList<>();
        list.add(null);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return help(root.left, root.right);
    }

    public boolean help(TreeNode l, TreeNode r){
        if (l == null || r == null) return l == null && r == null;
        return l.val == r.val &&
                help(l.left, r.right) &&
                help(l.right, r.left);
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
 help(left,right )
 根节点下的 两棵子树, left right , left 中的left的value == right中 right的value, left中的right。。。并递归成立

{
    Tree l,r // 左右子树
    l。v == r。v
    &&help(l.right, r.left)
    &&help(l.l, r.r)
 }


 TODO case
     1
    / \
   2   2
  / \ / \
 3  4 4  3
todo!! 注意 第三层 3和4是不等的,


 TODO bug

 bug1


 bug2

 bug3
 */

/*
TODO followup


TODO tutorial


 */
