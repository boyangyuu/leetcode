package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_22_ok_GenerateParentheses {
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        help("", res, n, n, 0);
        return res;
    }

    public static void help(String temp, List<String> res, int l, int r, int over){
        if (l == 0 && r == 0) {
            res.add(new String(temp));
            return;
        }
        if (over >= 1 && r >= 1) {
            temp += ')';
            help(temp, res, l, r - 1, over - 1);
            temp = temp.substring(0, temp.length() - 1);
        }
        if (l >= 1) {
            temp += "(";
            help(temp, res, l - 1, r, over + 1);
        }
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

 bug2
 bug3
 */




