package companys.squarespace.algo;

import java.util.*;

/**
 * Created by yuboyang on 8/28/17.
 */
public class shortestdistance {

    public Map<Character, List<Character>> edges = new HashMap<>();

    public void insert(char key, char insert) {
        if (edges.containsKey(key) == false) edges.put(key, new ArrayList<>());
        edges.get(key).add(insert);
    }

    public Set<Character> set = new HashSet<>();
    public int shortDist(char a, char b, HashSet<Character> set) {
        if (a == b) return 0;
        int ans = Integer.MAX_VALUE;
        List<Character> list = edges.get(a);
        if (list == null) return ans;
        for (int i = 0; i < list.size(); i++) {
            HashSet<Character> temp = (HashSet<Character>) set.clone();
            if (temp.contains(list.get(i))) continue;
            temp.add(list.get(i));
            int dist = shortDist(list.get(i), b, temp);
            temp.remove(list.get(i));
            if (dist == Integer.MAX_VALUE) continue;
            ans = Math.min(ans, 1 + dist);
        }
        return ans;
    }

    public static void main(String[] args) {
        shortestdistance sd = new shortestdistance();
        sd.insert('a', 'b');
        sd.insert('a', 'c');
        sd.insert('b', 'c');
        sd.insert('c', 'a');
        sd.insert('c', 'd');
        System.out.println(sd.shortDist('a', 'b', new HashSet<>()));
    }



}
