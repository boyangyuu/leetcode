package $;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// todo 6:32 -- 6:50

public class a_$247_bug_StrobogrammaticNumber2 {
    public static void main(String[] args) {
        System.out.println(findStrobogrammatic(2));
        System.out.println(findStrobogrammatic(3));

        //todo bug case
        System.out.println(findStrobogrammatic(3)); //todo excepted: not includes the 010 output: 010
        System.out.println(findStrobogrammatic(1)); //todo excepted: {0, 1, 8} output:{1, 8}
    }

    public static List<String> findStrobogrammatic(int n) {
        set.add('1');set.add('8');set.add('0');

        List<String> res = new ArrayList<>();
        help(res, new char[n], 0, n - 1);
        return res;
    }

    public static HashSet<Character> set = new HashSet<>();


    public static void help(List<String> res, char[] tmp , int i, int j) {
        if (i > j) {
            res.add(new String(tmp));
            return;
        }
        if (i != 0) {tmp[i] = '0';tmp[j] = '0';help(res, tmp, i + 1, j - 1);};
        {tmp[i] = '1';tmp[j] = '1';help(res, tmp, i + 1, j - 1);};
        if (i != j) {tmp[i] = '6';tmp[j] = '9';help(res, tmp, i + 1, j - 1);};
        {tmp[i] = '8';tmp[j] = '8';help(res, tmp, i + 1, j - 1);};
        if (i != j) {tmp[i] = '9';tmp[j] = '6';help(res, tmp, i + 1, j - 1);};
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




