package backtrack;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class bt_89_grayCode {
    static boolean finished = false;
    public static void main(String[] args) {
        int test = bt_89_grayCode.swap(4,0);
        System.out.println(test);
    }

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        help(0, n, set, res);
        return res;
    }

    void help(int cur, int n, HashSet<Integer> set, List<Integer> res) {
        if (set.size() == Math.pow(2, n)) return;
        if (!set.contains(cur)) {
            set.add(cur);
            res.add(cur);
        }

        for (int i = 0; i < n; i++) {
            int tmp = swap(cur, i);
            if (set.contains(tmp)) continue;
            help(tmp, n, set, res);
        }
    }

    static int swap(int n, int i) {
        // i = 1时, 0000010 => 1111101 尝试对第i位取0
        if (n != (n & ~(1 << i))) return n & ~(1 << i);
        else {
            // System.out.println("11");
            return n | (1 << i);
        }
    }



//    public void help (int[] visited, List<Integer> tmp, List<Integer> res) {
//        if (finished) return;
//        if (tmp.size() == visited.length) {
//            res = new ArrayList<>(tmp);
//            finished = true;
//        }
//
//        for (int i = 0; i < visited.length && visited[i] == 0; i++) {
//            if (i == 0) {
//                tmp.add(i);
//                continue;
//            }
//            int diff = i - tmp.get(tmp.size() - 1);
//            double sqrt = Math.sqrt(diff);
//            int q = (int)(sqrt * 10 % 10);
//            System.out.println(q);
//            if (q != 0) continue;
//            visited[i] = 1;
//            tmp.add(i);
//            help(visited, tmp, res);
//            tmp.remove(tmp.size() - 1);
//            visited[i] = 0;
//        }
//    }

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
