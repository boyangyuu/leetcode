package $;


import tree.TreeNode;

import javax.sound.midi.Track;


// 有logn 的解法 , n的解法
// 学习下 前中后序 找下一个 successor的方法
public class tree_$285_todo_InorderSuccessorinBST {
    public static void main(String[] args) {


    }

    // s1 boolean(whether traversed the target) then the next element after it will be the answer
    public TreeNode inorderSuccessor1(TreeNode root, TreeNode p) {
        return null;
    }

    // s2 (logn) best solution 找第一个比p大的值
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode res = root; // todo bug [0] , 0 . excepted : null out: 0
        TreeNode cur = root;
        while (cur != null) {
            if (p.val >= cur.val) {
                cur = cur.right;
            }
            else {
                res = cur;
                cur = cur.left;
            }
        }
        return res;
    }

    // s3 递归写法
    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        if (root == null) return null;
        if (root.val <= p.val) return inorderSuccessor(root.right, p);
        else {
            TreeNode left = inorderSuccessor(root.left, p);
            return left == null ? root : left;
        }
    }

    // todo successor
    public TreeNode successor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val <= p.val) {
            return successor(root.right, p);
        } else {
            TreeNode left = successor(root.left, p);
            return (left != null) ? left : root;
        }
    }

    // todo Predecessor 前序
    public TreeNode predecessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val >= p.val) {
            return predecessor(root.left, p);
        } else {
            TreeNode right = predecessor(root.right, p);
            return (right != null) ? right : root;
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
