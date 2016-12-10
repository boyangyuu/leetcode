package linkedList;

import tutorials.ListNode;

// 建议二次code
// 思路很绕, todo 记住让 fast or slow 凑整走到target即可 , 利用公式可推倒 (二者相交后, 新开节点, head1 slow 一起走, 相遇必然为target)
/*
   fast : l + r1 + n * r  = 2 * slow
   slow : l + r1
   => l + r1 = n * r
   想让其凑整, 则需要补上(r - r1), 可以得到 l = n * r - r1,
   于是, head1 从头开始走l步, slow一样走, 则 slow 与head1 必然相撞 => 答案

 */



public class ll_142_code_LinkedListCycle2 {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }











    public ListNode detectCycle1(ListNode head) {
        // step 1
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        //step 2
        ListNode head1 = head;
        while (head1 != slow) {
            head1 = head1.next;
            slow = slow.next;
        }
        return slow;
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



 wrong start:
    int slowStep // slow steps when slow and fast meet
    slowStep * 2 - slowStep = n * circumference // todo wrong!! 当圆比较小的时候 fast走了很多圆圈


 right start:
 fast 走了: l + n * c + m = 2 * steps
 slow 走了: l + m  = 1 * steps
 => l + nc + m = 2 * (l + m)
 => l + m = nc
 => l = nc - m
 猜测 一个新指针从index出发, 相交于 slow 于交叉点
 证明过程:
 假设此时一个新指针从index走 l 步, 那么 slow 指针走了 nc - m 步,相对于 交叉点 一共走了 nc - m + m 步, 即返回到了交叉点
 那么此时两指针是相交的, 得证



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
