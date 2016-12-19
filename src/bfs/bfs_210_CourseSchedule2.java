package bfs;

import linkedList.ll_0_tuition;
import tutorials.ListNode;

import java.lang.reflect.Array;
import java.util.*;


// solution1 construct list , then check if it is a circle. (it doesn't work cuz one node can have duplicate prequists courses)

// todo 在 CourseSchedule 基础上,添加queue即可  注意时间复杂度 为n*n (还有笨方法, 先找到第一个无pre的, 解除相关的关联, 继续找下一个无pre的, 递归这个过程, 为 n power n)
public class bfs_210_CourseSchedule2 {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        // todo special case 1
        System.out.println(Arrays.toString(findOrder(3, new int[][]{{1,2}, {1,0}, {2,1}}))); // expected false , todo 本题为所有pre都完事才可以选课
        System.out.println(Arrays.toString(findOrder(3, new int[][]{{1,2}, {1,0}, {2,0}})));


    }


    public static int[] findOrder(int numCourses, int[][] prerequisites) {
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
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] >= 1) continue;
            if (!help(visited, map, i, q)) return new int[0];
        }
        for (int i = 0; i < visited.length; i++)
            visited[i] = q.pollLast();
        return visited;
    }

    public static boolean help (int[] visited, HashMap<Integer, List<Integer>> map, int target, LinkedList<Integer> q) {
        if (map.containsKey(target) == false) {
            visited[target] = 2;
            q.push(target);
            return true;
        }
        List<Integer> l = map.get(target);
        boolean res = true;
        for (int i = 0; i < l.size(); i++) {
            int pre = l.get(i);
            if (visited[pre] == 1) return false;
            if (visited[pre] == 2) continue;
            visited[pre] = 1;
            res &= help(visited, map, pre, q);
        }

        if (res) {
            visited[target] = 2;
            q.push(target);
        }
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
