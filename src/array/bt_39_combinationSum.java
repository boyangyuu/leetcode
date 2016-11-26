package array;
import java.util.*;

//todo 仅需要复习下 如何去重 利用start指针即可。。
/*
 //todo 利用start记录即可
 2 => 2 => 2,3,4,7 =>..
      3 => 3,4,7
      4 => 4,7
      7 => 7
 todo 避免 {2,2,3} {3,2,2} 这种情况出现, 答案必须满足从小到大
 */

public class bt_39_combinationSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7};
        int target = 7;
        System.out.println(combinationSum1(nums, target));
    }

    public static List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> re = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        help(new ArrayList<Integer>(), res, candidates, 0, target);
        return res;
    }
    
    public static void help(List<Integer> tmp, List<List<Integer>> res, int[] candidates, int start, int target) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(tmp));
            return;
        } else if (target < 0) return;

        for (int i = start; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            help(tmp, res, candidates, i, target - candidates[i]); // todo i为start
            tmp.remove(tmp.size() - 1);
        }
    }


}
/** 题
 *39. Combination Sum
 * http:  https://leetcode.com/problems/combination-sum/
 *
 Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

todo solution
去重方法




todo bug
 bug1
 bug2
 bug3
 */