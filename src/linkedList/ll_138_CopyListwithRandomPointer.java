package linkedList;

import tutorials.ListNode;

public class ll_138_CopyListwithRandomPointer {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
        RandomListNode node1 = new RandomListNode(1);
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode node = new RandomListNode(head.label);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        return node;
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
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--


 TODO case

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
