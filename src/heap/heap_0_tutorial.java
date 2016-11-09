package heap;


import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.*;

public class heap_0_tutorial {
    public static void main(String[] args) {


    }

    public static void maxHeap() {
        // minHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 大的优先,最小堆 每次pop最小的

        // maxHeap
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            } //小的优先, 最小堆 每次pop最大的
        };

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(com); // 4 3 2 1


    }

}
/** 题
 *

 TODO judge
 1. kth small large
 2.


TODO tutorial
 todo O(n)
 add logn
 pop logn (reorder the elements)
 remove n

 todo offer add 等效

 todo 数组优化

TODO bug
 todo 越界
 heap.poll();  // todo 可能是 null

 todo 记住最大最小堆 别弄混

 todo

 */
