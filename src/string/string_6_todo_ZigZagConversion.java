package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

//todo 复习思路 用List<String> 记住不要尝试数学(On) 不需要code

public class string_6_todo_ZigZagConversion {
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(convert("abcabc", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s; //todo bug 1
        String[] strs = new String[numRows];
        int r = 0, flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if (strs[r] == null) strs[r] = "";
            strs[r] += s.charAt(i);
            System.out.println(strs[r]);
            if (r == numRows - 1) flag = -1;
            else if (r == 0) flag = 1;
            r += flag;
        }

        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i];
        }
        return res;
    }


    public String convert1(String s, int numRows) {
        int d =  numRows / 2;
        int rIndex = 0;
        String res = "";
        while (rIndex < numRows) {
            int i = rIndex;
            while (i < s.length()) {
                res += s.charAt(i);
                i += (Math.abs(d - rIndex) + 1) * 2;
                res += s.charAt(i);
            }
            rIndex++;
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

 todo 数字直接定位 (太容易出错)
 --performance
 time:On
 space:1

 --data structure

 --steps
idk!!!


 ######s2###### todo recommend
 --performance
 time:
 space:
 numRows个 String

 --data structure

 --steps

 ######sFinal######


 TODO case

 TODO bug
 bug1
 //
 =>
 if (numRows == 1) return s; //todo bug 1 flag 怎么方向都是错

 bug2
 //
 =>
 if (strs[r] == null) strs[r] = ""; // todo bug 2 strs[] 初始化为null not ""!!


 bug3
//
 =>
 if (strs[i] == null) continue; // todo bug 3

 */




