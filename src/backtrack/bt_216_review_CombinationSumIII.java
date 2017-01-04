package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 17/1/2 12:03 -- 12:19

public class bt_216_review_CombinationSumIII {
    public static void main(String[] args) {
        List list;Map map;

        System.out.println(combinationSum3(3, 9));

        // todo bug case
        System.out.println(combinationSum3(3, 7));
        System.out.println(combinationSum3(5, 11));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List res = new ArrayList();
        help(1, new int[n], k, n, new ArrayList<>(), res); // todo bug wait for fixed
        return res;
    }

    public static void help(int start, int visited[], int k, int n, List<Integer> tmp, List res) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i < 10; i++) {
            if (visited[i] == 0 && n >= i) {
                visited[i] = 1;
                tmp.add(i);
                help(i + 1, visited, k - 1, n - i, tmp, res);
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
 help(1, new int[n], k, n, new ArrayList<>(), res); // todo bug
 =>
 help(1, new int[10], k, n, new ArrayList<>(), res); // todo bug

 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
