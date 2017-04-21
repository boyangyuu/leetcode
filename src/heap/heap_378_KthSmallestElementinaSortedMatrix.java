package heap;
import java.util.*;

public class heap_378_KthSmallestElementinaSortedMatrix {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(10));

    }

    public int kthSmallest1(int[][] matrix, int k) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        PriorityQueue<Integer> heap = new PriorityQueue<>(com); // todo bug1
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                heap.add(matrix[r][c]);
                if (heap.size() > k) {
                    int i = heap.poll();
                    System.out.println("poll: " + i);
                }
            }
        }
        return heap.poll();

    }

    //todo better one!
    public static int kthSmallest(int[][] matrix, int k) {
        int size = matrix.length * matrix[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(size, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1 + o2;
            }
        });

        int lastPoll = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int cur = matrix[i][j];
                if (cur >= lastPoll) break; // todo 剪枝
                pq.offer(cur);
                if (pq.size() > k) lastPoll = pq.poll();
            }
        }
        return pq.poll();
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
 ######s0######
 step 1
 Math.sqar
错误, m[2][1] 与m[1][1](平方数) 关系不定!

 ######s1######
 binary

 ######s2######
 堆
 维护 k个元素的堆, 遍历所有元素

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow
 判断k的大小, 如果k 大于 num/2, 则求(num-k)th largest


 */

/*
TODO tutorial


 */
