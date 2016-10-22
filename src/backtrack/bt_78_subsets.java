package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bt_78_subsets {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(0, nums, new int[nums.length], new ArrayList<>(), res);
        return res;
    }

    public void help(int start, int[] nums, int[] visited, List<Integer> tmp, List<List<Integer>> res) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                tmp.add(nums[i]);
                help(i + 1, nums, visited, tmp, res);
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
