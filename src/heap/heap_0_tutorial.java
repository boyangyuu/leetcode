package heap;


import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.*;

public class heap_0_tutorial {
    public static void main(String[] args) {


    }

    public static void maxHeap() {
        // minHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 大的优先,最小堆 每次pop最小的
        List l;

        // maxHeap
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            } //小的优先, 最小堆 每次pop最大的
        };

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(com); // 4 3 2 1

        // deque 双端队列, 维护特殊的堆, 可以O n 时间维护
        // 见 head_239_slidingWIndowMaximum

        // todo  heap 每次 pop() 会出最小值, 但是peek不会, 只有每次pop 才会主动对里面的内容进行排序!!
        
    }

}
/** 题
 *

 TODO judge
 1. kth small large
 2.


TODO tutorial

 建堆时间 : O(n)证明
 https://www.zhihu.com/question/20729324

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
