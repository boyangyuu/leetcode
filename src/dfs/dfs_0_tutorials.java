package dfs;

import tree.TreeNode;

public class dfs_0_tutorials {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    /*
    todo 先序  中序  后序  层序
    其实这个顺序就是表示根节点所在的位置，左子树和右子树的顺序是固定的，都是先左后右。
    所以根结点与左右子树的关系就构成了三种顺序：
    1. 若在左右子树的前面被访问叫做前序，其顺序为根左右
    2. 若在左右子树的中间被访问叫做中序，其顺序为左根右 todo! 对于 二叉搜索树 bst来说 中序遍历是
    3. 若在左右子树的后面被访问叫做后序，其顺序为左右根


     */

    public void help(TreeNode root) {

        // 1.后序
        help(root.left);
        help(root.right);
//        visit root;
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

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
