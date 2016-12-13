package linkedList;

import tutorials.ListNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;


// todo 思路比较难, 编码也难, 建议再code 一遍
// todo 且 建议强记
public class ll_148_code_sortList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(3);

        int[] a = new int[] {1,5,3,6,4,2};
        mergeSort1(a, 0, a.length - 1);
//        System.out.println(Arrays.toString(a));

        node = sortList(node);
        ll_0_tuition.printListNode(node);

    }
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode slow = head, fast = head, pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return mergeList(sortList(head), sortList(slow));
    }


    // todo 记住如何merge listNode, 新建一个头即可, 不需要每次new
    public static ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                cur.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                cur.next = l1;
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    // todo  merge two array
    public static void mergeSort1(int[] arrays, int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        mergeSort1(arrays, 0, mid);
        mergeSort1(arrays, mid + 1, end);
        mergeArray1(arrays, start, mid, end);
    }

    public static void mergeArray1(int[] arrays, int start, int mid, int end){
        int i = start, j = mid + 1;
        int[] t = new int[end - start + 1];
        int c = 0;
        while (i <= mid || j <= end) {
            if (i == mid + 1) t[c] = arrays[j++];
            else if (j == end + 1) t[c] = arrays[i++];
            else if (arrays[i] < arrays[j]) t[c] = arrays[i++];
            else t[c] = arrays[j++];
            c++;
        }
        for (int k = start, m = 0; k <= end; k++, m++) {
            arrays[k] = t[m];
        }
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
 step 1
 create new dummy

 step 2
 LinkList cur : points to the node which to be insert
 traversal the head , insert to dummy

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
