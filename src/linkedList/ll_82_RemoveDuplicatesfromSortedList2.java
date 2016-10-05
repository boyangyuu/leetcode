package linkedList;

import tutorials.ListNode;

public class ll_82_RemoveDuplicatesfromSortedList2 {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode preHead = new ListNode(0); // todo solotion1 头指针可能被删除
        preHead.next = head;
        ListNode index = preHead;
        while (index.next != null) {
            ListNode cur = index.next;
            while (cur.next != null && cur.val == cur.next.val)
                cur = cur.next; // todo solution2 不着急删除, 找到结尾再直接一整段删除
            if (cur != index.next)   //todo solution3 cur 作为标志是否出现重复数, 需要删除
                index.next = cur.next;  // todo 删除整段的方法
            else
                index = index.next;
        }
        return preHead.next;

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
 todo!! structure
 ListNode preHead = new ListNode(0); // use: return the result
 ListNode index = preHead; // use : points to the lastest safe node
 ListNode cur = index.next; // use : points to the current checking node

 {2,2,3,4}
 0(pre),2,2,3,4
 index:0,
 cur : 2,
 =>
 0,3,4
 index:0
 cur:3 (delete 2,2)
 =>
 0,3,4
 index:0
 cur:3
 =>
 0,3,4
 index:3
 cur 4
 =>
 0,3,4
 index:4, break





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
