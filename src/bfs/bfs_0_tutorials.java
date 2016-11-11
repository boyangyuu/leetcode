package bfs;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bfs_0_tutorials {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    //水平遍历
    public void traverse(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>(); // java 用 LinkedList 作queue
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode cur = queue.pop();
            System.out.println(cur.val);
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }
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

 先序遍历




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
