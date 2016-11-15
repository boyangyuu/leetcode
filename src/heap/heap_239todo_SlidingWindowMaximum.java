package heap;

import java.util.*;

public class heap_239todo_SlidingWindowMaximum {
    public static void main(String[] args) {
        List list;Map map;
        PriorityQueue<Integer> heap = new PriorityQueue<>(2);

    }

    public void addQueue(Deque<Integer> deque, int num) {
        // clear useless elements
        while (deque.isEmpty() == false && deque.peekLast() <= num) deque.pollLast(); // todo bug 2 !!!! 重复的不一定是没用的!
        deque.add(num); // todo 加在队尾
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0]; // todo bug 1 // return []
        int[] res = new int[nums.length - k];
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < k - 1; i++) {
            addQueue(queue, nums[i]);
        }

        for (int i = k - 1; i < nums.length; i++) {
            res[i - k + 1] = queue.peekFirst();
            addQueue(queue, nums[i]);
            if (nums[i - k + 1] == queue.peekFirst()) queue.pollFirst();
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
 比较tricky的题目, 建议只需要记住即可。


 todo 参考 http://www.cnblogs.com/grandyang/p/4656517.html
 java http://www.jiuzhang.com/solutions/sliding-window-maximum/

 ######s1######
 --O(n)--
 双向队列 (前后元素均可拿到)
 队列只保留 可能有用的数字, 遍历, 小于新进数字的(1,2,7 进4) 必定对以后没用, 队首一直为当前最大值。
 1,2,7,4,8,6
 7
 7,4
 8

 --data--
 deque

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
  // todo bug 1
 =>
 if (nums.length == 0) return new int[]; // todo bug 1

 case
 Input:
 []
 0
 Output:
 null
 Expected:
 []

 bug2
 while (deque.isEmpty() == false && deque.peekLast() <= num) deque.pollLast(); // todo bug 2 !!!! 重复的不一定是没用的!
 =>
 while (deque.isEmpty() == false && deque.peekLast() < num) deque.pollLast(); // todo bug 2 !!!! 重复的不一定是没用的!

 case
 [-7,-8,7,5,7,1,6,0]
 4

 Out:
 [7,7,7,6,6]
 Expected:
 [7,7,7,7,7]

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
