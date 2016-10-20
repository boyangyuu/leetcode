package heap;


import java.util.PriorityQueue;

public class heap_215_kthLargetElementinanArray {
    public static void main(String[] args) {


    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(2);
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
            if (heap.size() > 2) heap.poll();
        }

        return heap.peek();
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
