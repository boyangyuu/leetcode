package heap;


import java.util.*;

public class heap_373_FindKPairswithSmallestSums {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Comparator<int[]> com = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] + o1[1] - o2[0] - o2[1];
            }
        };
        PriorityQueue<int[]> heap = new PriorityQueue<>(com);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                heap.add(new int[]{nums1[i], nums2[j]});
            }
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (heap.size() == 0) break; //todo bug1
            list.add(heap.poll());
        }
        return list;
    }



    // todo bad and bug, doesn't work!!!!
    public List<int[]> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length && k-- != 0) { //todo bug 1
            int[] cur = {nums1[i], nums2[j]};
            res.add(cur);

            if (i == nums1.length - 1) j++;
            else if (j == nums2.length - 1) i++;
            else if (nums1[i+1] + nums2[j] >= nums1[i] + nums2[j+1]) j++;
            else i++;
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


 ######s2######

 TODO case

 TODO bug
 bug1
 []
 []
 5

 output :[null,null,null,null,null]
 expected : []


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
