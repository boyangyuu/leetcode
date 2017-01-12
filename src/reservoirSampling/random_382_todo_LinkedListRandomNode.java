package reservoirSampling;
import tree.TreeNode;
import tutorials.ListNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
// todo learn reservoir (蓄水池) imaging the given input is extremely large and its length is unknown to u
/*
即先把前k个数放入蓄水池，对第k+1，我们以k/(k+1)概率决定是否要把它换入蓄水池，换入时随机的选取一个作为替换项，这样一直做下去，对于任意的样本空间n，对每个数的选取概率都为k/n。也就是说对每个数选取概率相等。

// todo 2 , how torandomly generate one arbitrary integer which is between 0 to given number, (nextInt)



 */
public class random_382_todo_LinkedListRandomNode {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;List list;HashMap map;LinkedList queue;
        for (int i = 0; i < 1000; i++) {
            System.out.println(new Random().nextInt(10)); // 0<= .. < 10 todo from 0(inclusive) to bound(exclusive)
        }



    }
    private ListNode head;
    private Random random = new Random();

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public random_382_todo_LinkedListRandomNode(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode cur = this.head;
        int res = cur.val;
        int l = 1; // cur position
        while(cur != null) {
            if (this.random.nextInt(l++) == 0) res = cur.val; // make the possibility is 1/l
            cur = cur.next;
        }
        return res;
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
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######
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
