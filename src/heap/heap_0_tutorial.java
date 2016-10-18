package heap;


import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.*;

public class heap_0_tutorial {
    public static void main(String[] args) {


    }

    public static void maxHeap() {
        // minHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 1,2,3,4, pop: 1,2,3,4

        // maxHeap
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(com); // 4 3 2 1


    }

}
/** 题
 *



TODO tutorial
 todo 数组优化


 */
