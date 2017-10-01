package companys.squarespace.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yuboyang on 8/28/17.
 */
class Pair {
    int src;
    int dest;
    public Pair(int s, int d) {
        src = s;
        dest = d;
    }
}

public class FindTheSrc {

    public static void main(String[] args) {
        List<Pair> pairs = Arrays.asList(new Pair(0,1), new Pair(1,2), new Pair(0,2), new Pair(2,3));
        FindTheSrc fts = new FindTheSrc();
        System.out.println(fts.getSrc(pairs, 3));
    }

    public List<Integer> getSrc(List<Pair> pairs, int dest) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (Pair p : pairs) {
            if (!map.containsKey(p.dest)) map.put(p.dest, new ArrayList<>());
            map.get(p.dest).add(p.src);
        }

        List<Integer> ans = new ArrayList<>();
        dfs(map, ans, dest);
        return ans;
    }

    public void dfs(HashMap<Integer, List<Integer>> map, List<Integer> ans, int dest) {
        if (map.containsKey(dest) == false) {
            ans.add(dest);
            return;
        }

        for (Integer node : map.get(dest))
            dfs(map, ans, node);
    }

}
