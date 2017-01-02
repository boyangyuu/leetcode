package $;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo learn  timeLimited , 学习优化

public class dp_$294_todo_FlipGame2 {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;

        System.out.println(canWin("++++"));
        System.out.println(canWin("+++++"));
    }

    public static boolean canWin(String s) {
        return help(s, 0);
    }

    public static boolean help(String s, int i) {
        boolean res = false;
        for (int j = i; j < s.length() - 1; j++) {
            if (s.charAt(j) == '+' && s.charAt(j + 1) == '+') {
                res |= !help(s.substring(0, j) + "--" + s.substring(j + 2, s.length()), 0);
                if (res) return true; // todo time limited
            }
        }
        return res;
    }

}

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
 //
 =>
 if (res) return res; // todo bug 不写的话超时 case "++++++++++++"

 bug2
 bug3
 */




