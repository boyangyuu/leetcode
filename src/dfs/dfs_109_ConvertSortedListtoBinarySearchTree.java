package dfs;

import tree.TreeNode;
import tutorials.ListNode;

import java.util.List;

public class dfs_109_ConvertSortedListtoBinarySearchTree {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        //find the mid index
        ListNode mid = head, end = head, last = head;
        while (end.next != null && end.next.next != null) { //todo bug1
            last = mid; // todo bug2
            mid = mid.next;
            end = end.next.next;
        }

        // create cur
        TreeNode cur = new TreeNode(mid.val);
        ListNode right = mid.next;
        last.next = null;
        if (head != mid) cur.left = sortedListToBST(head); // todo bug3 mid == head 则  left 为null
        if (right != null) cur.right = sortedListToBST(right); // todo bug4
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
the logic same as 108,
 to solve the finding middle index of the linkedlist, u can use the 2 points, one step by 1 , the other step by 2
 f(tree)
 {
    tree = Tree(midList.val);
    tree.left = f(leftList);
    tree.right = f(rightList);
    return tree;
 }

todo!! 需要研究明白 java的指针
 TODO case
 case1
 [0]


 TODO bug
 bug1
 while (end != null) { //todo bug1
 =>
 while (end.next != null) { //todo bug1
 =>
 while (end.next != null && end.next.next != null) { //todo bug1

 bug2
 mid = null;
 =>
 last = mid; //
 last.next = null  todo!!! bug2 require the last variable to cut off the mid to ends of the list



 bug3
 cur.left = sortedListToBST(head);
 =>
 if (head != mid) cur.left = sortedListToBST(head); // todo bug3 mid == head 则  left 为null case 1:[0]

 */

/*
TODO tutorial


TODO follow


 */
