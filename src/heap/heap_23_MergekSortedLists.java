package heap;


import tutorials.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class heap_23_MergekSortedLists {
    public static void main(String[] args) {
        List list;Map map;
        PriorityQueue<Integer> heap = new PriorityQueue<>(2);
        ListNode node;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        Comparator<ListNode> com = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return (o1.val - o2.val);
            }
        };
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(com);

        for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) minHeap.add(lists[i]);
        }
        while (minHeap.size() > 0) {
            ListNode listNode = minHeap.poll();
            if (listNode.next != null) minHeap.add(listNode.next);
            cur.next = new ListNode(listNode.val);
            cur = cur.next;
        }
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


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
