package lintcode;

import java.util.*;



  class UndirectedGraphNode {
      int label;
      ArrayList<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
  };

public class advanced_431_connectedComponentInUndirectedGraph {
    /**
     * @param nodes a array of Undirected graph node
     * @return a connected set of a Undirected graph
     */
    public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
        // step 1 uf
        HashSet<Integer> set = new HashSet<>();
        for (UndirectedGraphNode n : nodes) {
            set.add(n.label);
            for (UndirectedGraphNode c : n.neighbors) set.add(c.label);
        }

        UnionFind1 uf = new UnionFind1(set);

        // step 2 connect
        for (UndirectedGraphNode n : nodes) {
            for (UndirectedGraphNode c : n.neighbors)
                uf.union(n.label, c.label);
        }

        // step 3 get groups

        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (Integer i : uf.father.keySet())  {
            int ri = uf.find(i);
            if (map.containsKey(ri) == false) map.put(ri, new ArrayList<Integer>());
            map.get(ri).add(i);
        }
        for (int key : map.keySet()) {
            List<Integer> l = map.get(key);
            Collections.sort(l);
            res.add(l);
        }

        return res;

    }
}

 class UnionFind1 {
    public Map<Integer, Integer> father = new HashMap<>();

    public UnionFind1(HashSet<Integer> set) {
        for (Integer i : set) father.put(i, i);
    }

    public int find(int a) {
        int root = father.get(a);
        if (root == a) return root;
        return root = find(father.get(root));
    }

    public boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb) return false;
        father.put(ra, rb);
        return true;
    }

}