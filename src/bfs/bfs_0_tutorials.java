package bfs;

import tree.TreeNode;

import java.util.*;

public class bfs_0_tutorials {
    public static void main(String[] args) {
        //[2,1,3,*,*,*,4]
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);
        root.left = root1;root.right=root2;root1.right=root3;

        level2(root);
    }



    // todo 知道每行的 层序遍历   question 199,
    public static void level2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list.isEmpty() == false) {
            List<TreeNode> t = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                TreeNode cur = list.get(i);
                System.out.print(cur.val + ",");
                if (i == list.size() - 1) System.out.println();
                if (cur.left != null) t.add(cur.left);
                if (cur.right != null) t.add(cur.right);
            }
            list = t;
        }
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
