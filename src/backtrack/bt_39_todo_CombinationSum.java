package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bt_39_todo_CombinationSum {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        help(candidates, target, new ArrayList<>(), res, 0);
        return res;
    }

    public void help(int[] candidates, int target, List<Integer> tmp,  List<List<Integer>> res, int start) {

        if (target == 0) res.add(new ArrayList<Integer>(tmp)); //todo bug 2
        if (target <= 0) return;
        for (int i = start; i < candidates.length; i++) {
//            target -= candidates[i]; //todo bug1
            tmp.add(candidates[i]);
            help(candidates, target - candidates[i], tmp, res, i);
//            tmp.remove((Integer) candidates[i]);//
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
 ######s1######


 ######s2######

 ######sFinal######

 TODO case
 case 1

 **Input:**
 [2,3,6,7]
 7
 **Output:**
 [[2,2,3],[2,3,2],[3,2,2],[7]]
 **Expected:**
 [[2,2,3],[7]]



 TODO bug
 bug1
  target -= candidates[i]; //todo bug1
 help(candidates, target, tmp, res);
 =>
 help(candidates, target - candidates[i], tmp, res); //todo bug 1 for 循环会减很多次

 bug2
 if (target == 0) res.add(new ArrayList<Integer>(tmp)); //todo bug 2
 =>
 if (target == 0) res.add((tmp)); //todo bug 2 要new新的对象

 bug3
 for (int i = 0; i < candidates.length; i++) {  // todo!!!!!!!!!! bug 3 case 1
 =>
 for (int i = start; i < candidates.length; i++) { // todo bug 3 避免重复计算和add

 TODO follow

 */

/*
TODO tutorial


 */
