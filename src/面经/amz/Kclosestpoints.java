package 面经.amz;

import java.nio.channels.Pipe;
import java.util.*;

/**
 * Created by yuboyang on 2/20/17.
 */

/*
question:
Find the K closest points to the origin in a 2D plane, given an array containing N points.


https://shepherdyuan.wordpress.com/2014/07/23/linkedin-k-closest-points/

n * log k
 */
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Kclosestpoints {
    public static void main(String[] args) {

    }

    public static List<Point> findKClosest(Point[] p, int k) {
        Comparator<Point> com = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.x * o1.x + o1.y * o1.y - o2.x * o2.x - o2.y * o2.y;
            }
        };
        PriorityQueue<Point> pq = new PriorityQueue<>(com);
        for (int i = 0; i < p.length; i++) {
            if (pq.size() < k) {
                pq.offer(p[i]);
            } else {
                pq.offer(p[i]); // todo bug , rem to offer first
                pq.poll();
            }
        }

        List<Point> res = new ArrayList<>();
        while (pq.isEmpty() == false) {
            res.add(pq.poll());
        }
        return res;
    }


}
