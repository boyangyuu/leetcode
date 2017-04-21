package 面经.amz;

import linkedList.RandomListNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by yuboyang on 2/21/17.
 */

/*

A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.
 */
public class CopyListwithRandomPointer {
    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        node1.next = node2;
        node2.next = node3;
        node1.random = node2;
        node2.random = node1;


        RandomListNode res = copyRandomList(node1);
        while (res != null) {
            System.out.println(res.label + ", " + res.next.label + ", " + res.random.label);
            res = res.next;
        }
    }

    public static RandomListNode copyRandomList(RandomListNode head) {
        // step1 old->new map
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>(); // old -> new
        RandomListNode cur = head;
        while (cur != null) {
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }

        //step 2, build random,  next
        Iterator<Map.Entry<RandomListNode, RandomListNode>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<RandomListNode, RandomListNode> next = it.next();
            next.getValue().next = map.get(next.getKey().next);
            next.getValue().random = map.get(next.getKey().random);
        }
        return map.get(head);
    }
}
