package lintcode;

import java.util.*;

public class advanced_178_graphvalidtree {
    /**
     * @param n an integer
     * @param edges a list of undirected edges
     * @return true if it's a valid tree, or false
     */
    public boolean validTree(int n, int[][] edges) {
        // Write your code here
        UnionFind uf = new UnionFind(n);
        HashSet<Integer> set;
//        set.contains()

        for (int[] e : edges) {
            if (!uf.union(e[0], e[1])) return false;
        }

        return uf.query() == 1;
    }
}

class UnionFind {
    public int[] father;
    public int count;
    public UnionFind(int n) {
        father = new int[n];
        count = n;
        for (int i = 1; i < n; i++) {
            father[i] = i;
        }
        LinkedList<Integer> deque = new LinkedList<>();
        PriorityQueue<Integer> pq;
    }

    public int find(int a) {
        if (a == father[a]) {
            return a;
        }
        return father[a] = find(father[a]);
    }

    public boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb) return false;
        father[ra] = rb;
        count--;
        return true;
    }

    public int query() {
        return count;
    }

}

