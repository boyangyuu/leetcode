package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bt_46_Permutations {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(nums, new int[nums.length], new ArrayList<>(), res);
        return res;
    }

    public void help(int[] nums, int[] visited, List<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                tmp.add(nums[i]);
                help(nums, visited, tmp, res);
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
 note the solution set must not contain duplicate combinations.
 不允许出现 重复的combination组合


 TODO solotion
 ######s1######
 backtracking

 int[] visited // 已经访问过的数字 (0:没有访问过:可添加, 1 访问过 不可添加)


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
