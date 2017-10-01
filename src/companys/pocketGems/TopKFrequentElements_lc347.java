package companys.pocketGems;

import java.util.*;

/**
 * Created by yuboyang on 7/10/17.
 */
public class TopKFrequentElements_lc347 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((e1, e2)->e1 - e2);
        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k) pq.poll();

        }
        return pq.poll();
    }
}
