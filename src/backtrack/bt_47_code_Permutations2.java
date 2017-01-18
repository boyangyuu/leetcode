package backtrack;


import java.util.*;
// todo 思路1、 set去重。 思路2、想的不好, 要用树状去想, 建议下次code
// bug case

public class bt_47_code_Permutations2 {
    public static void main(String[] args) {
        List list;Map map; Set<Integer> set = new HashSet();
        System.out.println();
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        help(nums, new int[nums.length], new ArrayList<>(), res);
        return res;
    }

    public static void help(int[] nums, int[] visited, List<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList(tmp));
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
   1,1,3

 1 只有一次机会


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
