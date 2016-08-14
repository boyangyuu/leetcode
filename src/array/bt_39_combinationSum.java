package array;
import java.util.*;

public class bt_39_combinationSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7};
        int target = 7;
        combinationSum(nums, target);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> re = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        solve(stack, candidates, 0, target, re);
        return re;
    }

    public static void solve(List<Integer> stack, int[] candidates, int deep, int target, List<List<Integer>> re){
        //
        System.out.println("stack" + stack);

        if (deep >= candidates.length) return;;

        //出口
        int v = candidates[deep];
        if (v == target) {
            stack.add(v);
            re.add(stack);
            return;
        }

        if (v > target) return;
        for (int i = 0; i <= target / v; i++) {
            //do
            stack.add(stack.size(), v);
            target -= v;
            solve(stack, candidates, deep + 1, target, re);
            //undo
            target += v;
            stack.remove(stack.size() - 1);
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

 思路 :
 求解解空间 (树状)
 解(进0次, deep) => {2,3,6,7}
 解(进1次, 解(进0次, deep - 1)) => 2 * 1 + {3,6,7}   .... (进n次, 解(进0次,deep -1)) 2 * n + {3,6,7}
 .....
 解(进0次, 0) 出口

 深度优先遍历 记住是深度优先!!



 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */