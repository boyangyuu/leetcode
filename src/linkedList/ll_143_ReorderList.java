package linkedList;

import tutorials.ListNode;

public class ll_143_ReorderList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
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
