package systemDesign.c3_consistentHash_tinyurl;

import java.util.*;

/**
 * Created by yuboyang on 7/28/17.
 */

/*

每次找到最大的, 并一分为二
一般的数据库进行horizontal shard的方法是指，把 id 对 数据库服务器总数 n 取模，然后来得到他在哪台机器上。这种方法的缺点是，当数据继续增加，我们需要增加数据库服务器，将 n 变为 n+1 时，几乎所有的数据都要移动，这就造成了不 consistent。为了减少这种 naive 的 hash方法(%n) 带来的缺陷，出现了一种新的hash算法：一致性哈希的算法——Consistent Hashing。这种算法有很多种实现方式，这里我们来实现一种简单的 Consistent Hashing。

将 id 对 360 取模，假如一开始有3台机器，那么让3台机器分别负责0~119, 120~239, 240~359 的三个部分。那么模出来是多少，查一下在哪个区间，就去哪台机器。
当机器从 n 台变为 n+1 台了以后，我们从n个区间中，
todo!! 找到最大的一个区间，然后一分为二，把一半给第n+1台机器。
比如从3台变4台的时候，我们找到了第3个区间0~119是当前最大的一个区间，那么我们把0~119分为0~59和60~119两个部分。0~59仍然给第1台机器，60~119给第4台机器。
然后接着从4台变5台，我们找到最大的区间是第3个区间120~239，一分为二之后，变为 120~179, 180~239。
假设一开始所有的数据都在一台机器上，请问加到第 n 台机器的时候，区间的分布情况和对应的机器编号分别是多少？
 */
public class ConsistentHash {
        /**
         * @param n a positive integer
         * @return n x 3 matrix
         */
        public List<List<Integer>> consistentHashing(int n) {
            // Write your code here
            PriorityQueue<Range> heap = new PriorityQueue<>(16,
                    new Comparator<Range>() {
                        @Override
                        public int compare(Range r1, Range r2) {
                            if (r1.to - r1.from > r2.to - r2.from) return -1;
                            if (r1.to - r1.from < r2.to - r2.from) return 1;
                            return r1.id - r2.id;
                        }
                    }
            );
            heap.offer(new Range(1, 0, 359));
            for(int i = 2; i <= n; i++) {
                Range range = heap.poll();
                Range range1 = new Range(range.id, range.from, (range.from+range.to)/2);
                Range range2 = new Range(i, (range.from+range.to)/2+1, range.to);
                heap.offer(range1);
                heap.offer(range2);
            }
            Range[] ranges = heap.toArray(new Range[0]);
            List<List<Integer>> results = new ArrayList<>(ranges.length);
            for(int i = 0; i < ranges.length; i++) {
                List<Integer> result = new ArrayList<>(3);
                result.add(ranges[i].from);
                result.add(ranges[i].to);
                result.add(ranges[i].id);
                results.add(result);
            }
            return results;
        }
    }
    class Range {
        int id;
        int from, to;
        Range(int id, int from, int to) {
            this.id = id;
            this.from = from;
            this.to = to;
        }
    }
