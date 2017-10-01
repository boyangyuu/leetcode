package graph;

import java.util.*;


public class graph_269_AlienDictionary {
    public String alienOrder(String[] words) {

        // step 1 init
        HashMap<Character, Set<Character>> graph = new HashMap<>(); // set 为所有父节点, 这样便于查找和删除
        HashMap<Character, Integer> inDegree = new HashMap<>();
        for (String s : words) {
            for (char c : s.toCharArray()) {
                if (!graph.containsKey(c)) graph.put(c, new HashSet<>());
                if (!inDegree.containsKey(c)) inDegree.put(c, 0);
            }
        }


        // step 2 build relations
        for (int i = 0; i < words.length - 1; i++) {
            int min = Math.min(words[i].length(), words[i + 1].length());
            for (int j = 0; j < min; j++) {
                char c0 = words[i].charAt(j);
                char c1 = words[i + 1].charAt(j);
                if (c0 != c1) {
                    if (!graph.get(c0).contains(c1)) { // todo bug 2 case :  ["za","zb","ca","cb"] , 两次a->b
                        graph.get(c0).add(c1);
                        inDegree.put(c1, inDegree.get(c1) + 1);
                    }
                    break;
                }
            }
        }
        for (char c : inDegree.keySet())
            System.out.println("key: " + c + ", " + inDegree.get(c));


        // step 3 remove from inDegree
        String res = "";
        while (exist(inDegree)) {
            char cur = getNextChar(inDegree);
            res += cur;
            Set<Character> set = graph.get(cur);
            for (char c : set) {
                inDegree.put(c, inDegree.get(c) - 1);
            }
            inDegree.remove(cur);
            graph.remove(cur);
        }
        if (inDegree.size() == 0) return res; //todo bug 1
        else return "";
    }

    public boolean exist(HashMap<Character, Integer> inDegree) {
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {

                return true;
            }
        }
        return false;
    }

    public Character getNextChar(HashMap<Character, Integer> inDegree) {
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                inDegree.remove(c);
                return c;
            }
        }
        return null;
    }
}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion
 ######s1######
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--


 TODO case

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
