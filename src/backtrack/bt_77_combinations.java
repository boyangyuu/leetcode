package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bt_77_combinations {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) nums[i] = i + 1;
        help(0, nums, new int[nums.length], k, new ArrayList<>(), res);
        return res;
    }

    public void help(int start, int[] nums, int[] visited, int k, List<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                tmp.add(nums[i]);
                help(i + 1, nums, visited, k, tmp, res);
                visited[i] = 0;
                tmp.remove(tmp.size() - 1);
            }
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


 ######s2######

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
