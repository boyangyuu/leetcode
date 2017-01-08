package linkedList;

import tutorials.ListNode;

import java.util.List;


// todo
public class ll_328_rem_OddEvenLinkedList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        System.out.println(node);
    }


    // 强记代码, 绝壁别自己写 特别坑
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head; ListNode oddHead = odd;
        ListNode even = head.next; ListNode evenHead = even;
        while(even != null && even.next != null){ // todo  base on even , do not base on odd!!, cuz even.next determine the odd is null or not
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;

        }

        odd.next = evenHead; // now, odd must be the end of oddList, so it can not be null!!
        return head;
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
 keep the first even element as fEven,
 move the oven element to the tail ,
 until meet fEven again

 for example
 1 2 3 4 5
 分成奇偶 两组, 最后合并

 => 1 3 4 5 , 2
 => 1 3 5 , 2->4


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
