package backtrack;


import java.util.*;

public class bt_40_CombinationSum2 {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();
        help(candidates, target, 0, new ArrayList<>(), res);
        List<List<Integer>> list = new ArrayList<>(res);
        return list;
    }

    public void help(int[] candidates, int target, int start, List<Integer> tmp, Set<List<Integer>> res) {
        if (target == 0) res.add(new ArrayList<>(tmp));
        if (target <= 0) return;
        for (int i = start; i < candidates.length; i++) {
//            if (i > start && candidates[i] == candidates[i - 1]) continue;
            tmp.add(candidates[i]);
            help(candidates, target - candidates[i], i + 1, tmp, res);
            tmp.remove(tmp.size() - 1);
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


 TODO solotion
 类似 bt_39_combinationSum

 ######s1######
 set 解决去重问题

 ######s2######
 解决去重问题
 if (i > start && num[i] == num[i - 1]) continue; //todo

 case 1


 ######sFinal######

 TODO case
 case 1
 Your input

 [10,1,2,7,6,1,5] =》 [1,1,2,5,6,7,10]
 8
 Your answer

 [[1,1,6],[1,2,5],[1,7],[1,2,5],[1,7],[2,6]]
 Expected answer

 [[1,1,6],[1,2,5],[1,7],[2,6]]

 解决:
 nums[0] = 1, 可以处理 nums[1:n], 比如 {1+1+2}, {1+2}
 nums[1] = 1, 与上一个元素相等则要忽略, 比如 {1+2}

 TODO bug
 bug1

 bug2

 bug3

 TODO follow

 */

/*
TODO tutorial


 */
