package $;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 第一次做 accepted 但是复习下思路吧、
// todo 注意题干, 记住bugcase

public class string_294_todo_FlipGame2 {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;
        list.add("abc");list.add("abcd");list.add("abce");

        // todo bug case flip 不仅仅一次
        System.out.println(canWin("++++++")); // "++++++" => "++--++" => ?? => "------" also the starter will win!!

        System.out.println(canWin("+-+-+"));
        System.out.println(canWin("+++++"));
        System.out.println(canWin("++++----++--"));
    }

    public static boolean canWin(String s) {
        boolean res = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                String news = s.substring(0, i) + "--" + s.substring(i + 2, s.length());
                res |= !canWin(news);
                if (res) return res; // todo bug
            }
        }
        return res;
    }

    // todo wrong
    public static boolean canWin1(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                cnt++;
                i += 2;
            }
        }
        return cnt == 1;
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




