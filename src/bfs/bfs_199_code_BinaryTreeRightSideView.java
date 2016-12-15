package bfs;

import tree.TreeNode;
import java.util.*;


//todo 需要重新code
// todo 修正  错误思想 只需要遍历所有右边的节点 例如    【1,2,4,3】
// todo 学习 两种解决方案 递归 非递归

public class bfs_199_code_BinaryTreeRightSideView {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;

        // todo bug case
        //[1,2,3,4]
    }


    public static List<Integer> rightSideView2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list.isEmpty() == false) {
            List<TreeNode> t = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                TreeNode cur = list.get(i);
                if (i == list.size() - 1) res.add(cur.val);
                if (cur.left != null) t.add(cur.left);
                if (cur.right != null) t.add(cur.right);
            }
            list = t;
        }

        return res;
    }

    // wrong
    public static List<Integer> rightSideView1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while (queue.isEmpty() == false) {
            TreeNode cur = queue.pop();
            res.add(cur.val);
            if (cur.right != null) {
                queue.push(cur.right);
                continue;
            }
            if (cur.left != null) queue.push(cur.left);
        }
        return res;
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
