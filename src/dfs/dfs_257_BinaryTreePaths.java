package dfs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class dfs_257_BinaryTreePaths {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        help(root, "", list);
        return list;
    }

    public void help(TreeNode root,String str, List<String> list) {
        if (root == null) return;
        int l = str.length();
        if (str.length() == 0) str += root.val; //todo bug1
        else str += "->" + root.val;

        if (root.left == null && root.right == null)
            list.add(new String(str));
        else if (root.left == null)
            help(root.right, str, list);
        else if (root.right == null)
            help(root.left, str, list);
        else {
            help(root.left, str, list);
            help(root.right, str, list);
        }
        str.substring(0, l);
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
 help(root, list, lists)
 = {

   list.add
   if (root.left == null && root.right == null) ..
   else if ..
   else if
   else help(root.left) help(root.right)
   // restore
   list.remove..


 }

 TODO case

 TODO bug
 bug1
case {1}
 output : {"->1"}
 expected {"1"}
 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
