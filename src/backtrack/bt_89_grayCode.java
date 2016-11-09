package backtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bt_89_grayCode {
    static boolean finished = false;
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        help(new int[n * n], new ArrayList<>(), res);
        return res;
    }

    public void help (int[] visited, List<Integer> tmp, List<Integer> res) {
        if (finished) return;
        if (tmp.size() == visited.length) {
            res = new ArrayList<>(tmp);
            finished = true;
        }

        for (int i = 0; i < visited.length && visited[i] == 0; i++) {
            if (i == 0) {
                tmp.add(i);
                continue;
            }

            int diff = i - tmp.get(tmp.size() - 1);
            double sqrt = Math.sqrt(diff);
            int q = (int)(sqrt * 10 % 10);
            System.out.println(q);
            if (q != 0) continue;
            visited[i] = 1;
            tmp.add(i);
            help(visited, tmp, res);
            tmp.remove(tmp.size() - 1);
            visited[i] = 0;
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
