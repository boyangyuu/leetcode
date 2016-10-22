package backtrack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class bt_47_Permutations2 {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // todo bug 2
        help(nums, new int[nums.length], new ArrayList<>(), res);
        return res;
    }

    public void help(int[] nums, int[] visited, List<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) continue; // todo bug 1
            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) continue;
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
set 去重

 ######s2######
 去重
 //            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) continue; // todo bug 1
 case 1,1,2

 nums[1] 永不出头, 只有nums[0] 出头过, nums[1] 才出来

 ######sFinal######

 TODO case

 TODO bug
 bug1
 //            if (i > 0 && nums[i] == nums[i - 1]) continue; // todo bug 1
 =>
 //            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) continue; // todo bug 1

 bug2
 //
 =>
 Arrays.sort(nums); // todo bug 2 要想去重 需要先排序 : solution2 判断相等才有意义
 bug3


 TODO follow

 */

/*
TODO tutorial


 */
