package dfs;

import tree.TreeNode;

public class dfs_337_houseRobber3 {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public int rob(TreeNode root) {
        return help(root, true);
    }

    public int help(TreeNode root, boolean canRob){
        if (root == null) return 0;
        if (canRob)
            return Math.max(
                    root.val + help(root.left, false) + help(root.right, false),
                    help(root.left, true) + help(root.right, true));
        else
            return help(root.left, true) + help(root.right, true);

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
 数组的话
 f(n) = {
    max{
        xn + f(n-2),
        f(n-1)
    }

 }

 f(Tree root,Boolean b) = {
  b == true then max {
        root.val + f(root.left, false) + f(root.right, false)
        f(root.left, true) + f(root.right, true)
    }
  b == false then {
        f(root.left, true) + f(root.left, true);
    }

 }


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
