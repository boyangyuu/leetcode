package backtrack;


import java.util.*;

/*
todo 重写写一遍, 不要用 set
 */

public class bt_90_todo_subsets2 {
    public static void main(String[] args) {
        List list;Map map; HashSet set;
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }
















    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        HashSet<List<Integer>> res = new HashSet<>();
        help(res, new ArrayList<Integer>(), visited, nums, 0);
        return new ArrayList<>(res);
    }

    public static void help(HashSet<List<Integer>> res, List<Integer> tmp, int[] visited, int[] nums, int start) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            tmp.add(nums[i]);
            visited[i] = 1;
            help(res, tmp, visited, nums, i + 1);
            tmp.remove(tmp.size() - 1);
            visited[i] = 0;
        }
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
 TODO translation

 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
