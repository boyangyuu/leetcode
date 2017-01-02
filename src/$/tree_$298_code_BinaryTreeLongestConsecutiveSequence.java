package $;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// todo
// 2017/1/1 : 3:00 -- 2h
public class tree_$298_code_BinaryTreeLongestConsecutiveSequence {

    public static void main(String[] args) {

    }

    private int res;

    // s1
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0; // todo bug 1
//        help(root, root.val, 0);
//        return res;
        return help1(root, root.val, 0);
    }

    /*
        尝试去更新res
     */
    public void help(TreeNode root, int target, int tmp) {
        if (root == null) return;
        if (root.val == target) tmp++;
        else tmp = 1;
        res = Math.max(res, tmp);
        help(root.left, root.val + 1, tmp); // target => root.val  todo bug 2
        help(root.right, root.val + 1, tmp);
    }

    //s2
    public int help1(TreeNode root, int target, int tmp) {
        if (root == null) return 0;
        if (root.val == target) tmp++;
        else tmp = 0;
        int c = Math.max(help1(root.left, root.val + 1, tmp), help1(root.right, root.val + 1, tmp));
        return c + tmp;
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
 方法1 较笨 剥皮法, 每次剥一层leaves
 traverse , in every row which is leaf should be added in res stack from right to left ,
 recursively next row


 方法2 标记深度值(深度越浅的, 深度值代表剥叶子批次, 则越先成为第一批次叶子)
 record the depth of every node, depth = 1 + Max.depth(cur.l, cur.r)
 the smaller the depth of the nodes, the index of the remove group they will be

 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

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
