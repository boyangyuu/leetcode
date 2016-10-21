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
 ######sFinal######

 TODO case
 case 1
 Your input

 [10,1,2,7,6,1,5]
 8
 Your answer

 [[1,1,6],[1,2,5],[1,7],[1,2,5],[1,7],[2,6]]
 Expected answer

 [[1,1,6],[1,2,5],[1,7],[2,6]]

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
