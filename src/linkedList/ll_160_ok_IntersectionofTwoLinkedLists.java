package linkedList;

import tutorials.ListNode;

public class ll_160_ok_IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // step1
        int la = getLength(headA);
        int lb = getLength(headB);
        int k = Math.abs(la - lb);
        ListNode indexSlow, indexFast;
        if (la >= lb) {
            indexSlow = headB;
            indexFast = headA;
        } else {
            indexSlow = headA;
            indexFast = headB;
        }

        //step2
        while (k != 0) {
            k--;
            indexFast = indexFast.next;
        }

        // step3
        while (indexFast != null && indexSlow != null) {
            if (indexFast == indexSlow) return indexFast;
            else {
                indexFast = indexFast.next;
                indexSlow = indexSlow.next;
            }
        }

        return null;
    }

    public int getLength(ListNode head) {
        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
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
 {
    step 1
    count the length of two linked list

    step 2
    place the two indexs

    step 3
    start them together until they are same


 }

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
