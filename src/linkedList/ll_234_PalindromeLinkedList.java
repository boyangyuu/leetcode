package linkedList;

import tutorials.ListNode;

import java.util.List;

public class ll_234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid = head, slow = head;
        //step 1
        while(slow.next != null && slow.next.next != null) {
            mid = mid.next;
            slow = slow.next.next;
        }

        //step 2 reverse // todo bug 1
        ListNode cur = mid.next;
        while(cur.next != null) {
            // 1 2 3 4 3 2(cur) 1 => 1 2 3 4 3->1, temp->2
            ListNode temp = cur.next;
            cur.next = cur.next.next;

            temp.next = mid.next;
            mid.next = temp;
        }

        // test
        // ListNode test = head;
        // while(test != null) {
        //     System.out.println(test.val + ",");
        //     test = test.next;
        // }

        while (mid.next != null) {
            if (head.val != mid.next.val) return false;
            head = head.next;
            mid = mid.next;
        }

        return true;
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
 time n space 1

 --data--
 two pointers
 indexM(middle), indexFast()
 --step1--
 find the middle element (2/4,3/5)

 --step2--
 reverse the second half of the list by space 1

 --step3--
 1,2,3,1,2(middle : 3) 或 1,2,1,2(middle : 2)




 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--


 TODO case

 TODO bug
 bug1
 多多练习如何翻转链表,
 技巧  case 5 4 3 2 1

 cur 假设为3, 别假设为4, 容易算错!!
 step1: 将 2 拆出来
 step2: 将 2 插入到5,4之间


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
