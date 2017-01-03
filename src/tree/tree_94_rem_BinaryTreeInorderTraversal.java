package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class tree_94_rem_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        //[2,1,3,*,*,*,4] 1层 2; 2层 1,3 ;3层 4
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);root.left = root1;root.right=root3;root3.right=root4;
        System.out.println(inorderTraversal(root));
        System.out.println(preorderT(root));
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
//            System.out.println(cur.val);
            cur = cur.right;
        }
        return res;
    }

    public static List<Integer> preorderT(TreeNode root) {
        LinkedList<TreeNode> s = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || !s.isEmpty()) {
            while (cur != null) {
//                System.out.println(cur);
                res.add(cur.val);
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            cur = cur.right;
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
