package tree;

import tree.TreeNode;

import java.util.List;
import java.util.Map;
import java.util.Set;



public class tree_222_CountCompleteTreeNodes {



    public static void main(String[] args) {
        List list;Map map;Set set;TreeNode node;
    }

    public int countNodes(TreeNode root) {
        int hl = 0, hr = 0;
        TreeNode left = root.left, right = root.right;
        while (left != null) {hl++;left = left.left;}
        while (right != null) {hr++;right = right.left;}
        if (hl == hr) return (int)Math.pow(2, hl) + countNodes(root.right); // todo bug 1
        else return (int)Math.pow(2, hr) + countNodes(root.left);
    }

    public int countNodes1(TreeNode root) {
        int deepLeft = 0, deepRight = 0;
        TreeNode left = root, right = root;
        while (left != null) {deepLeft++;left = left.left;}
        while (right != null) {deepRight++;right = right.right;}
        if (deepLeft == deepRight) return (int)Math.pow(2, deepLeft) - 1;
        else return countNodes(root.left) + countNodes(root.right) + 1;
    }

    //
}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
 https://discuss.leetcode.com/topic/15533/concise-java-solutions-o-log-n-2
 分别取 root.left, root.right 的高度, leftH, rightH (递归left)
 若相等 则
 if (leftH == rightH)
    f = 1 << leftH + f(root.right)
 else
    f = 1 << rightH + f(root.left)

 TODO case

 TODO bug

 bug1
 if (hl == hr) return (int)Math.pow(2, hl) + countNodes(root.right); // todo bug 1
 =>
 if (hl == hr) return 1 << hl + countNodes(root.right); // todo bug 1
 todo 这样大幅优化速度 , 否则会 LTE
 bug2
 bug3
 */




