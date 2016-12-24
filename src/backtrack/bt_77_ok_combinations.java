package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 12/24 11:37am -- 11:43 am
public class bt_77_ok_combinations {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        help(1, n, k, new ArrayList<>(), res);
        return res;
    }

    public void help(int start, int nums, int k, List<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for(int i = start; i <= nums; i++) {
            tmp.add(i);
            help(i + 1, nums, k, tmp, res);
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
 TODO translation



 TODO solotion
 ######s1######


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
