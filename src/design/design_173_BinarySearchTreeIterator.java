package design;


import tree.TreeNode;

import java.util.*;

public class design_173_BinarySearchTreeIterator {
    public Stack<Integer> stack = new Stack<>();
    public LinkedList<Integer> list = new LinkedList<>();

    public design_173_BinarySearchTreeIterator(TreeNode root) {
        traverseTree(root);
    }

    public void traverseTree (TreeNode root){
        if (root == null) return;
        traverseTree(root.left);
        list.push(root.val);
        traverseTree(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return list.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return list.pollLast();
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


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
