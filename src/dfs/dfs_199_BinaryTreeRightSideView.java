package dfs;

import tree.TreeNode;
import java.util.*;

public class dfs_199_BinaryTreeRightSideView {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        help(root, 0, list);
        return list;
    }

    public void help(TreeNode root, int level, List<Integer> list) {
        if (root == null) return;
        if (list.size() <= level)
            list.add(level, root.val); //todo bug1
        else
            list.set(level, root.val);

        help(root.left, level + 1, list);
        help(root.right, level + 1, list);
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
 bug1
 if (list.getObject(level) == null) list.add(level, root.val);
 =>
 if (list.size() <= level) list.add(level, root.val);

 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
