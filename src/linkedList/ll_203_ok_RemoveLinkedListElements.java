package linkedList;

import tutorials.ListNode;


// 12/15 7:15--7:21pm bf
public class ll_203_ok_RemoveLinkedListElements {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

//        System.out.println(removeElements(node, 1));
//        System.out.println(removeElements(node, 10));
        System.out.println(removeElements(node, 2));
    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        dummy.next = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
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
