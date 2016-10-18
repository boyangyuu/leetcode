package binarySearch;
import java.util.*;

public class bs_378_KthSmallestElementinaSortedMatrix {
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
        PriorityQueue<Integer> heap = new PriorityQueue<>(com);
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

    public int kthSmallest(int[][] matrix, int k) {
        int k1 = (int)Math.sqrt(k);
        int cnt = k1 * k1;
        if (cnt == k) return matrix[k1 - 1][k1 - 1];
        int i = 0, j = 0;
        while (i < k1 && j < k1){
//            if (cnt == k) return matrix[i][j];
            int v1 = matrix[k1][i]; // right
            int v2 = matrix[j][k1]; // below

            if (j == k1 - 1 || v1 <= v2) {
                cnt++;
                i++;
                if (cnt == k) return v1;
            }
            else {
                cnt++;
                j++;
                if (cnt == k) return v2;
            };
        }
        return -1;
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
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
