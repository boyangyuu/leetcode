package graph;

import java.util.*;


// solution1 construct list , then check if it is a circle. (it doesn't work cuz one node can have duplicate prequists courses)

// todo learn Topological sort

public class graph_207_CourseSchedule {
    public static void main(String[] args) {


        // todo special case 1
        System.out.println(canFinish(3, new int[][]{{1,2}, {1,0}, {2,1}})); // expected false , todo 本题为所有pre都完事才可以选课
        System.out.println(canFinish(3, new int[][]{{1,2}, {1,0}, {2,0}}));

        // circle case
        System.out.println(canFinish(3, new int[][]{{1,2}, {1,0}, {2,0}}));

        // todo bug case
        System.out.println(canFinish(1, new int[][]{})); // no inDegree
    }

    // in degree (BFS) n * n
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        //step 1 construct directed graph , degree
        HashMap<Integer, Set<Integer>> graph = new HashMap<>(); // for case {1,2} 1->{2} 1 depend 2
        LinkedList<Integer> q = new LinkedList<>();

        HashMap<Integer, Integer> inDegree = new HashMap<>(); //  1 's degree is 1, 2 's is 0
        List l;
        

        for (int i = 0; i < prerequisites.length; i++) {
            int pre = prerequisites[i][0];
            int wait = prerequisites[i][1];
            if (graph.containsKey(pre) == false) graph.put(pre, new HashSet<>());
            if (graph.containsKey(wait) == false) graph.put(wait, new HashSet<>());
            graph.get(pre).add(wait);

            if (inDegree.containsKey(pre) == false) inDegree.put(pre, 0);
            if (inDegree.containsKey(wait) == false) inDegree.put(wait, 0);
            inDegree.put(wait, inDegree.get(wait) + 1);
        }



        //forloop to cut the zero indegree one , todo 首先解决入度为0, 不依赖别人, 但是很多人依赖它的这种
        for (int i = 0; i < numCourses; i++) { // cut numCourses times
            if (inDegree.isEmpty()) return true;
            boolean isCut = false;
            for (Integer e : inDegree.keySet()) {
                if (inDegree.get(e) == 0) {
                    for (Integer wait : graph.get(e)) inDegree.put(wait, inDegree.get(wait) - 1);
                    inDegree.remove(e);
                    isCut = true; // todo 判断是否有环
                    break;
                }
            }
            if (!isCut) return false;
        }
        return true;
    }

    // dfs
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
