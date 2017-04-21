package tree;


import java.util.*;

// todo 没有一遍通过, 有bug, 先过思路, 代码不用写
public class tree_144_todo_BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        // todo bug case
        // {1,2,3} output : 1,3,2 expected 1,2,3
        int[] a1;

        String[][] tickets = new String[][]{{}};
        Map<String, PriorityQueue<String>> targets = new HashMap<>();
        

    }



    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;
        LinkedList<TreeNode> s = new LinkedList<>();
        s.push(root);
        while (s.isEmpty() == false) {
            TreeNode cur = s.pop();
            res.add(cur.val);
            if (cur.right != null) s.push(cur.right); // todo bug 先right 后left,cuz 入栈顺序先进后出
            if (cur.left != null) s.push(cur.left);
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
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



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
