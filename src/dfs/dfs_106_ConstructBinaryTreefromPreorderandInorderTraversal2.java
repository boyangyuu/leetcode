package dfs;

import tree.TreeNode;
import tutorials.ListNode;

import java.util.LinkedList;

public class dfs_106_ConstructBinaryTreefromPreorderandInorderTraversal2 {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node = buildTree1(new int[]{1,2,3,4,5}, new int[]{1,2,4,5,3});
        LinkedList<TreeNode> l = new LinkedList<>();
        l.add(node);
        while (l.isEmpty() == false) {
            TreeNode cur = l.pollFirst();
            System.out.println(cur.val);
            if (cur.left != null) l.add(cur.left);
            if (cur.right != null) l.add(cur.right);
        }
    }

    public static TreeNode buildTree1(int[] inorder, int[] postorder) {
        return help(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public static TreeNode help(int[] inorder, int[] postorder, int il, int ir, int pl, int pr) {
        if (il > ir || pl > pr) return null;
        TreeNode node = new TreeNode(postorder[pr]);
        int rootIndex = -1;
        for (int i = il; i <= ir; i++) if (postorder[pr] == inorder[i]) rootIndex = i;
        node.left = help(inorder, postorder, il, rootIndex - 1, pl, rootIndex - 1 - il + pl);
        node.right = help(inorder, postorder, rootIndex + 1, ir, pr - ir + rootIndex, pr - 1);
        return node;
    }








    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return help(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode help(int[] inorder, int il, int ir, int[] postorder, int pl, int pr) {
        if (il > ir || pl > pr) return null;
        int i = 0;
        TreeNode cur = new TreeNode(postorder[pr]);
        for (i = il; i <= ir; i++)
            if (inorder[i] == cur.val) break; // the left length is il - i
        cur.left  = help(inorder, il, i - 1, postorder, pl, pl + i - il - 1); // should be length - 1 , todo bug attention
        cur.right = help(inorder, i + 1, ir, postorder, pl + i - il, pr - 1) ; // todo bug
        return cur;

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
 cur.left  = help(inorder, il, i - 1, postorder, pl, pl + i - il); // todo!!!! bug attention
 cur.left  = help(inorder, il, i - 1, postorder, pl, pl + i - il - 1); // todo bug attention

 it should be length - 1 , as (i - il) - 1 , because it is the index (from 0 to l -1 )

 bug2
 cur.right = help(inorder, i + 1, ir, postorder, pl + i - il, pr) ; // todo bug
 cur.right = help(inorder, i + 1, ir, postorder, pl + i - il, pr - 1) ; // todo bug

/*
TODO tutorial

    1　　　　　　preorder:　　  1　　2　　3
   / \　　　　　  inorder:　　     2　　1　　3
 2    3　　  　　 postorder:　　 2　　3　　1

 todo!! 递归理解
  inorder[]  : {left: [left root right] root right: [left root right]}
 postorder[]  : {left: [left right root]  right: [root right left] root}

we can use the preorder[0] as the root, to divide the INORDER to left , root, right
also , according the length of left part , we can divde the PREOREDR too
then, recursively divide pre and in arrays

help(pre, )
{


}

TODO follow


 */
