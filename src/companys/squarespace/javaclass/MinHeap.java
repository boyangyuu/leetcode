package companys.squarespace.javaclass;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by yuboyang on 9/3/17.
 */
public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.poll();
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
