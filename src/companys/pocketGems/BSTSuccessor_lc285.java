package companys.pocketGems;

import tree.TreeNode;

/**
 * Created by yuboyang on 7/5/17.
 */


public class BSTSuccessor_lc285 {

    /*

    https://leetcode.com/problems/inorder-successor-in-bst/#/description
followup
     BST 祖先点，懂的人都懂。 然后开始时设计随机数，烙印也给了4个follow up, (暴力设计; 不能使用系统random的设计;输出一个长度为k的数组，call之前的method; 给一个无限长的stream, 从stream中随机抽k个数返回这个长度为k的数组) 最后一个我胡乱写的，写完烙说可以work。然后就挂了。再次吐槽烙印的两面三刀属性。
     */

    /*
    recursively TODO 思路, 找最后一个大于p的node!
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) return null;
        if (root.val <= p.val) return inorderSuccessor(root.right, p); // 当前值<= 目标值, 则一定在右侧
        else  {   // 如果左侧有值, return 左侧, 否则 return 当前
            TreeNode left = inorderSuccessor(root.left, p);
            return left == null ? root : left;
        }
    }

    /*
     inorder
     traverse as inorder, store every visited value in pre,
     then if pre equals p, the current value should be ret
     */

    TreeNode pre, res;
    public TreeNode inorderSuccessor1(TreeNode root, TreeNode p) {
        inOrder(root, p);
        return res;
    }

    void inOrder(TreeNode root, TreeNode p) {
        if (root == null) return;
        inOrder(root.left, p);
        if (pre == p) res = root;
        pre = root;
        inOrder(root.right, p);
    }

    /*
    Iterator

     */
    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        TreeNode res = null;
        while (root != null) {
            if (root.val > p.val) { // possible
                res = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return res;

    }

}
