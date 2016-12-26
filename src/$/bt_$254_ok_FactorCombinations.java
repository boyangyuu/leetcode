package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 12/25 2:20--2:34 bf
public class bt_254_ok_FactorCombinations {
    public static void main(String[] args) {
        List list;Map map;
        System.out.println(getFactors(8));
    }

    public static List<List<Integer>> getFactors(int n) {
        List res = new ArrayList();
        help(res, new ArrayList<>(), n, 2);
        return res;
    }

    public static void help(List<List<Integer>> list, List<Integer> tmp, int target, int n) {
        if (target == 1 && tmp.size() >= 2) list.add(new ArrayList<>(tmp));

        for (int i = n; i <= target; i++) {

            if (target % i == 0) {
                tmp.add(i);
                help(list, tmp, target / i, i);
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
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

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
