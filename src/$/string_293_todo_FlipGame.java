package $;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 学习如何更改string 思路很简单

public class string_293_todo_FlipGame {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;
        list.add("abc");list.add("abcd");list.add("abce");
        System.out.println(generatePossibleNextMoves("++++"));
    }

    public static List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                char[] chars = s.toCharArray();
                chars[i] = '-';
                chars[i + 1] = '-';
                res.add(new String(chars));
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

 bug2
 bug3
 */




