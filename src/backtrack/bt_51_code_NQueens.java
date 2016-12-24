package backtrack;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// 8:10 - 9:10
public class bt_51_code_NQueens {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;

        list.add(new char[] {'.', '.', 'Q'});
        list.add(new char[] {'.', '.', '.'});
        list.add(new char[] {'.', '.', '.'});
        System.out.println(check(list, 1, 1));
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        List res = new ArrayList();
        List<char[]> temp = new ArrayList<>();
        char[] s = new char[n];
        for (int i = 0; i < n; i++) s[i] = '.';
        for (int i = 0; i < n; i++) temp.add(Arrays.copyOf(s, s.length)); // todo wrong: for (int i = 0; i < n; i++) temp.add(s);
        help(res, temp, 0);
        return res;
    }

    public static void help (List<List<String>> res, List<char[]> temp, int r) {
        if (r == temp.size()) {
            List<String> temps = new ArrayList<>();
            for (int i = 0; i < temp.size(); i++) temps.add(new String(temp.get(i)));
            res.add(new ArrayList(temps));
            return;
        }

        for (int c = 0; c < temp.get(r).length; c++) {
            if (check(temp, r, c)) {
                temp.get(r)[c] = 'Q';
                help(res, temp, r + 1);
                temp.get(r)[c] = '.';
            }
        }
    }

    public static boolean check(List<char []> temp, int r, int c) {
        // column
        for (int i = 0; i < temp.size(); i++)
            if (temp.get(i)[c] == 'Q') return false;

        //left right 左上方运动
        int r1 = r, cl = c;
        while (--r1 >= 0 && --cl >= 0) if (temp.get(r1)[cl] == 'Q') return false;

        // 右上方
        r1 = r;
        int cr = c;
        while (--r1 >= 0 && ++cr < temp.get(0).length) if (temp.get(r1)[cr] == 'Q') return false;

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
