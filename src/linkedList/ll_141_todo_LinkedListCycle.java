package linkedList;

import tutorials.ListNode;

// todo 不需要code 思路坏掉了5分钟, 链表存在环, 则 必然会出现 -----(环) , 而不会出现 -----(环)----
public class ll_141_todo_LinkedListCycle {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }

    public static boolean hasCycle(ListNode head) {
        ListNode l1 = head, l2 = head;
        while (l2 != null && l2.next != null) {
            l2 = l2.next.next;
            l1 = l1.next;
            if (l1 == l2) return true;
        }
        return false;
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
           . . . . !
            .    .
             .  。
 _____________.
 l : 直线长度
 c : 圆周长
 m : 相遇位置相对答案坐标



 step 1
 slow , fast index,  check exist circle or not

 step 2
 place another index ans to head, ans and slow move together , then meet again , the index is answer




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
