package linkedList;

import tutorials.ListNode;
// 12/15  7:52--8:00 bf 但是技巧还是不够快速 todo 不用编程
// todo 强记 reversLinked cur 从 1开始即可, 之后 cur 一直都是1 // case 1,2,3,4,5 不断处理cur.next
public class ll_206_todo_ReverseLinkedList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        System.out.println(reverseList(node));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy.next;
        while (cur.next != null) {
            ListNode t = cur.next;
            cur.next = cur.next.next;

            t.next = dummy.next;
            dummy.next = t;
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
