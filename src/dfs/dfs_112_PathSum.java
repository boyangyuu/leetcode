package dfs;

import tree.TreeNode;

public class dfs_112_PathSum {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false; //todo!! bug1 case1
        return help(root, sum);
    }

    public boolean help(TreeNode root, int sum) {
        if (root == null) return sum == 0;

        if (root.left == null) return help(root.right, sum - root.val);  // todo!! bug2 case2
        else if (root.right == null) return help(root.left, sum - root.val);
        else
            return help(root.left, sum - root.val) ||
                help(root.right, sum - root.val);
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
 f (root, sum) = {
    if (root == null) return sum == 0;
    else return f(left, sum - root.v) || f(right, sum - root.v)
 }

 TODO case
 todo!! case1
 [] 0   这里需要为false

 todo!! case2
 本题意思为leaf!!
 [1,2] 1
 out treu
 expected false

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
