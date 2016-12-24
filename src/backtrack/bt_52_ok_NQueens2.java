package backtrack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// 8:10 - 9:10
public class bt_52_ok_NQueens2 {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;

        list.add(new char[] {'.', '.', 'Q'});
        list.add(new char[] {'.', '.', '.'});
        list.add(new char[] {'.', '.', '.'});
        System.out.println(check(list, 1, 1));
        System.out.println(totalNQueens(4));
        System.out.println(totalNQueens(2));
    }

    public static int totalNQueens(int n) {
        List<char[]> temp = new ArrayList<>();
        char[] s = new char[n];
        Arrays.fill(s, '.');
        for (int i = 0; i < n; i++) temp.add(s.clone());

        return help(0, temp, 0);
    }

    public static int help(int res, List<char[]> temp, int r) {
        if (r == temp.size()) {
            return res + 1;
        }
        for (int i = 0; i < temp.get(r).length; i++) {
            if (check(temp,r, i)) {
                temp.get(r)[i] = 'Q';
                res = Math.max(res, help(res, temp, r + 1));
                temp.get(r)[i] = '.';
            }
        }
        return res;
    }

    public static boolean check(List<char[]> temp, int r, int c) {
        // check column
        for (int i = 0; i < r; i++)
            if (temp.get(i)[c] == 'Q') return false;

        // check left up
        int r1 = r, c1 = c;
        while (--r1 >= 0 && --c1 >= 0) if (temp.get(r1)[c1] == 'Q') return false;

        // check right up
        int r2 = r, c2 = c;
        while (--r2 >= 0 && ++c2 < temp.get(r).length) if (temp.get(r2)[c2] == 'Q') return false;

        return true;
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
