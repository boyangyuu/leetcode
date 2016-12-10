package linkedList;

import tutorials.ListNode;

// todo 思路慢了下, 5分钟,
public class ll_143_code_ReorderList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }


    public static void reorderList1(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return;
        // step 1 find mid
        ListNode l1 = head, l2 = head;
        while (l2 != null && l2.next != null) {
            l2 = l2.next.next;
            l1 = l1.next;
        }

        // step 2 reverse // 1,2,3 cut ,4,5; 1,2,3  cut 4
        ListNode dummy = new ListNode(-1);
        dummy.next = l1.next;
        l1.next = null;
        ListNode cur = dummy.next;
        while (cur.next != null) {
            ListNode t = cur.next;
            cur.next = cur.next.next;
            t.next = dummy.next;
            dummy.next = t;
        }

        // step 3 merge
        ListNode head1 = head;
        while (dummy.next != null) {
            ListNode t = dummy.next;
            dummy.next = dummy.next.next;

            t.next = head1.next;
            head1.next = t;
            head1 = t.next;
        }
    }









    public void reorderList(ListNode head) {
        //step 1
        if (head == null || head.next == null) return;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        slow.next = null;

        //step 2 // 3 4 5 6
        ListNode pre = right, cur = right; // pre->3 cur->3
        while (cur != null && cur.next != null) {
            ListNode tmp = cur.next; // 3,4(tmp),5,6
            cur.next = cur.next.next; // 3,4,5,6 => 3(pre ,cur),5,6 ; 4(tmp)
            tmp.next = pre;     //4(tmp),3(cur),5,6
            pre = tmp;     // 4(pre),3(cur),5,6
        }

        //step 3 // 1,2,3  4,5,6
        ListNode curL = head;
        while (pre != null) {
            // get the element(curR) from the pre
            ListNode curR = pre;
            pre = pre.next;

            // insert the element(curR) to the left
            curR.next = curL.next;
            curL.next = curR;
            curL = curL.next.next;
        }

    }

    public void reverseListNode(ListNode head) { // todo!!


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

 todo case 1,2,3,4,5,6
 todo 记住 分割为 1,2,3,4 ; 5,6 之后, 5,6 分别插入 152634 满足条件

 todo WTF!!!!!!!超费劲的题
 step 1
 divide from the middle , the left is more
 ListNode slow , fast;
 case {1,2,3,4,5}
 l:1, r:1 => l:2, r:3 => l3 r:4
 case {1,2}
 l:1, r:1 => l:1, r:null

 step 2
 reverse the right part    //todo!!! solution


 case {0,1,2,3,4}
 cur: 1
 List next = cur.next; //2
 cur.next = cur.next.next;
 next.next = cur;
 cur = next;



 step 3
 base on left to insert



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
