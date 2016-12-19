package heap;


import java.util.PriorityQueue;

// 默认 大的优先, 呈现堆状, 大的在下面, pop的是小的
public class heap_215_todo_kthLargetElementinanArray {
    public static void main(String[] args) {
        System.out.println(findKthLargest1(new int[]{3,2,2,1,0}, 2));

    }

    public static int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((e1,e2)->e1-e2);
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size() > k) queue.poll();
        }
        return queue.peek();
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
