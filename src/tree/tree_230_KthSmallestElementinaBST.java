package tree;


import java.util.Stack;

public class tree_230_KthSmallestElementinaBST {


    public static void main(String[] args) {

    }

    // s2
    public int kthSmallest(TreeNode root, int k) {
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || stack.isEmpty() == false) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (--k == 0) return cur.val;

            cur = cur.right;
        }
        return -1;
    }


    // s1#######
    public static int res;
    public static int K;
    public int kthSmallest_(TreeNode root, int k) {
        K = k;
        kthSmallest1(root);
        return res;
    }

    public void kthSmallest1(TreeNode root) {
        if (root == null) return;
        kthSmallest1(root.left);
        if (--K == 0) ///todo bug1
            res = root.val;

        kthSmallest1(root.right);
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
######s1 中序遍历
 todo 注意 static 的用法

######s2 非递归实现



 TODO case

 TODO bug
 bug1
 if (K-- == 0) ///todo bug1
 =>
 if (--K == 0) ///todo bug1

 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
