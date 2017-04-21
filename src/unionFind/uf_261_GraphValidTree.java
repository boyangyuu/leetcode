package unionFind;



/*
corner case // todo bug1
4 [1,2], [3,4]
expected : false

todo 需要加上query, count 以检测是否完全连通

*/

/*
3 [1,2] [2,3] [1,3]
检测是否闭环

 */


import java.util.HashSet;

public class uf_261_GraphValidTree {
    class UnionFind {
        int[] fathers;
        int count;

        public UnionFind(int n) {
            fathers = new int[n];
            for (int i = 0; i < fathers.length; i++) {
                fathers[i] = i;
            }
            count = n;
        }

        int find(int a) {
            if (fathers[a] == a) {
                return a;
            }
            return fathers[a] = find(fathers[a]);

        }

        boolean union(int a, int b) {
            int ra = find(a);
            int rb = find(b);
            if (ra == rb) return false;
            fathers[ra] = rb;
            count--;
            return true;
        }

        int query() {
            return count;
        }
    }


    public boolean validTree(int n, int[][] edges) {
        if (n == 1) return true;
        HashSet<Integer> set = new HashSet<>();
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) set.add(i);
        for (int[] e : edges) {
            if (set.contains(e[0])) set.remove(e[0]);
            if (set.contains(e[1])) set.remove(e[1]);
            if (uf.union(e[0], e[1]) == false) return false;
        }

        return set.size() == 0 && uf.query() == 1;
    }
}