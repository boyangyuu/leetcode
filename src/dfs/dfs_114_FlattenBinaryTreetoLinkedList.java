package dfs;

import tree.TreeNode;

public class dfs_114_FlattenBinaryTreetoLinkedList {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            // step 1
            TreeNode cur1 = cur.left; // todo!! bug1

            while (cur1 != null &&cur1.right != null) cur1 = cur1.right;

            if (cur1 != null) {  // todo!! bug2
                cur1.right = cur.right;
                //step 2
                cur.right = cur.left;
                cur.left = null; //todo bug3
            }

            //step 3
            cur = cur.right;
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

 1. move the whole right leaf the tail of the left
 2. move the whole left leaf to the right of the root
 3. recursive the process to the right node of the root

       5(root)
      / \
     3   6
 =>
       5(root)
      / \
     3
      \
      6
 =>
       5
       \
       3(root)
       \
       6

 TODO case

 TODO bug
 bug1
 //
 =>
 TreeNode cur1 = cur.left; // todo!! bug1
 bug2



 bug3
 //
 =>
 cur.left = null; //todo bug3

TODO tutorial


TODO follow


 */
