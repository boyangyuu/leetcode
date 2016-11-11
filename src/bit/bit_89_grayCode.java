package bit;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class bit_89_grayCode {
    static boolean finished = false;
    public static void main(String[] args) {
        int test = bit_89_grayCode.swap(4,0);
        System.out.println(test);
    }

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        help(0, n, res);
        return res;
    }

    void help(int cur, int n, List<Integer> res) {
        if (res.size() == Math.pow(2, n)) return;
        if (!res.contains(cur)) {
            res.add(cur);
        }

        for (int i = 0; i < n; i++) {
            int tmp = swap(cur, i);
            if (res.contains(tmp)) continue;
            help(tmp, n, res);
            break; // todo
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
 000=>001=>000(x)=>011=>010=>100=>101=>111=>110

 从0开始, 每位取反, 迭代地add,

 每位取反操作:
 尝试  cur 与 110111(~001000),
 如果有变化, 则说明 cur 的 第i位 是1, 那么 return cur 与 110111
 如果无变化 则说明第i位是0, 那么  return cur 或 001000


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
