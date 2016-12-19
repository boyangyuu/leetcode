package bfs;

import linkedList.ll_0_tuition;
import tutorials.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// solution1 construct list , then check if it is a circle. (it doesn't work cuz one node can have duplicate prequists courses)

// todo dfs 均可 (不建议学图论)
public class bfs_207_CourseSchedule {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        // todo special case 1
        System.out.println(canFinish_dfs(3, new int[][]{{1,2}, {1,0}, {2,1}})); // expected false , todo 本题为所有pre都完事才可以选课
        System.out.println(canFinish_dfs(3, new int[][]{{1,2}, {1,0}, {2,0}}));


    }


    /*
        bfs
     */
    public static boolean canFinish_dfs(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] pair : prerequisites) {
            if (map.containsKey(pair[0])) {
                map.get(pair[0]).add(pair[1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(pair[1]);
                map.put(pair[0], list);
            }
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] >= 1) continue;
            if (!help(visited, map, i)) return false;
        }
        return true;
    }

    public static boolean help (int[] visited, HashMap<Integer, List<Integer>> map, int target) {
        if (map.containsKey(target) == false) {
            visited[target] = 2;
            return true;
        }
        List<Integer> l = map.get(target);
        boolean res = true;
        for (int i = 0; i < l.size(); i++) {
            int pre = l.get(i);
            if (visited[pre] == 1) return false;
            if (visited[pre] == 2) continue;
            visited[pre] = 1;
            res &= help(visited, map, pre);

//     todo bug      if (res) for (int j = 0; j < visited.length; j++) if(visited[i] == 1) visited[i] = 2; 这种是不对的, 只有最尾的没pre得才是确定可以学, 其他的没准还有其他pre
        }
        if (res) visited[target] = 2;
        return res;
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
