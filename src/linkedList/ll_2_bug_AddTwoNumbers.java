package linkedList;

import tutorials.ListNode;


// 建议重新code 之后看备注
// todo bug1
// todo slow solution is not good
public class ll_2_bug_AddTwoNumbers {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        System.out.println(node);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(-1), cur = res;
        while(l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry != 0) cur.next = new ListNode(1);
        return res.next;
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
 todo 1. 建议新建数组 2.当心bug carry

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

 todo // bug case  5->1 , 5->9 // special case 5, 5->1
 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
