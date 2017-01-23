package linkedList;

import tutorials.ListNode;

import java.util.LinkedList;

public class ll_0_tuition {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = getLinkedList(10);
        ListNode newNode = reverseList(node);
        System.out.print("\nafter reverse: "); printListNode(newNode);

        //todo linkedlist (双向队列)
    }

    // 翻转 list (技巧, 5,4,3,2,1 假设 cur 为 3,之后移动2)
    public static ListNode reverseList(ListNode head) {
//        printListNode(head);
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode cur = res.next;
        while (cur.next != null) {
            printListNode(res.next);
            //delete
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            System.out.println("temp:" + temp.val);

            //insert to res(head)
            temp.next = res.next;
            res.next = temp;
        }
        return res.next;
    }


    public static ListNode getLinkedList(int n) {
        int i = 0;
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while (++i <= n) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return res.next;
    }

    public static void printListNode(ListNode node) {
        ListNode cur = node;
        while(cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.println();
    }









}
/** 题
 *
 * http:
 *

TODO tutorial
1. 常见思路
 a. 断开,合并
 b. 先翻转下, 再..
 c. 不停插入
 d. 快慢指针





TODO follow


 */
