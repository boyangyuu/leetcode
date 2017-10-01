package heap;

import java.util.*;

/**
 * Created by yuboyang on 9/13/17.
 */
public class heap_218_TheSkylineProblem {
    public class Pair {
        public int i;
        public int h;
        public boolean isStart;
        Pair(int i, int h, boolean isStart) {
            this.i = i;
            this.h = h;
            this.isStart = isStart;
        }
    }
    public List<int[]> getSkyline(int[][] buildings) {
        // build the pair and sort it
        List<Pair> pairs = new ArrayList<>();
        for (int[] b : buildings) {
            pairs.add(new Pair(b[0], b[2], true));
            pairs.add(new Pair(b[1], b[2], false));
        }
        pairs.sort((p1, p2) -> {
            if(p1.i == p2.i) return p1.isStart ? 0 : 1;
            else return p1.i - p2.i;
        });

        // forloop the pair, maintain the pq, drow the point when maxHeight is updated
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<int[]> ans = new ArrayList<>();
        for (Pair p : pairs) {
            int prevH = pq.size() == 0 ? 0 : pq.peek();
            if (p.isStart) pq.offer(p.h);
            else pq.remove(p.h);
            int curH = pq.size() == 0 ? 0 : pq.peek();
            if (prevH != curH) {
                ans.add(new int[]{p.i, curH});
            }
        }

        return ans;
    }
}
