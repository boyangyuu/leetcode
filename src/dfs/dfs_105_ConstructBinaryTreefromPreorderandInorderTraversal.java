package dfs;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// todo !!!想法不够快和编程速度(40minutes) 都不行, 需要重写code

// todo 注意 边界写法

public class dfs_105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
        node = buildTree1(new int[]{3,2,1,5,4}, new int[]{1, 2, 3, 4, 5});
        LinkedList<TreeNode> s = new LinkedList<>(); // 既可以当队列, 又可以当站 todo !!水平输出需要用队列 不是站
        s.add(node);
        while(!s.isEmpty()) {
            TreeNode cur = s.pollFirst();
            System.out.println(cur.val);
            if (cur.left != null) s.add(cur.left);
            if (cur.right != null) s.add(cur.right);
        }
    }

    public static TreeNode buildTree1(int[] preorder, int[] inorder) {
        return help(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    //todo 想不到 递归 return tree
    public static TreeNode help(int[] preorder, int[] inorder, int pl, int pr, int il, int ir) {
        if (pl > pr || il > ir) return null; // todo !! 边界写法 不要写成 0 <pl < l, ....
        int rootV = preorder[pl];
        TreeNode cur = new TreeNode(rootV);
        int mid = -1;
        for (int i = il; i <= ir; i++) if (inorder[i] == rootV) mid = i;
        cur.left = help(preorder, inorder, pl + 1, mid + pl - il, il, mid - 1);
        cur.right = help(preorder, inorder, pr - ir + mid + 1, pr, mid + 1, ir);
        return cur;
    }













    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode help(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr || il > ir) return null;

        //get the divide index, divide the inorder to left , right
        int i;
        TreeNode root = new TreeNode(preorder[pl]);
        for (i = il; i <= ir; i++) { //todo bug 1
            if (preorder[pl] == root.val) break;  // cuz the question said they r distinct
        }
        root.left = help(preorder, pl + 1, pl + i - il, inorder, il, i - 1); //i - il means the length of the left due to the divide
        root.right = help(preorder, pl + i - il + 1, pr, inorder, i + 1, ir); //todo bug
        return root;
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
 for (i = pl; i < inorder.length; i++) { //todo bug 1
 for (i = il; i <= ir; i++) { //todo bug 1

 bug2

 bug3
 */

/*
TODO tutorial

    1　　　　　　preorder:　　  1　　2　　3
   / \　　　　　  inorder:　　     2　　1　　3
 2    3　　  　　 postorder:　　 2　　3　　1

 todo!! 递归理解
 preorder[] : {root, left: [root left right], right : [root left right]}
 inorder[]  : {left: [left root right] root right: [left root right]}

we can use the preorder[0] as the root, to divide the INORDER to left , root, right
also , according the length of left part , we can divde the PREOREDR too
then, recursively divide pre and in arrays

help(pre, )
{


}

TODO follow


 */
