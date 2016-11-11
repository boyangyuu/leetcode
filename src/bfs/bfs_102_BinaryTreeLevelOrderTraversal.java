package bfs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class bfs_102_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
        List list;HashMap map;LinkedList queue;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        while (queue.size() != 0) {
            List<Integer> list = new ArrayList<>();
            LinkedList<TreeNode> newQueue = new LinkedList<>();
            while(queue.size() != 0){
                TreeNode cur = queue.pop();
                list.add(cur.val);
                if (cur.left != null) newQueue.add(cur.left);
                if (cur.right != null) newQueue.add(cur.right);
            }
            queue = newQueue;
            res.add(list);
        }
        return res;
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
 #solotion1 time: space:

 #solotion2 time: space:

 TODO case

 TODO bug
 bug1
 for (int i = 0; i < queue.size(); i++) { //todo bug 1
 =>
 while(queue.size() != 0){ // todo bug 1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
