package $;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


// tag : learn , review
// todo learn char => int, int => char;
// todo learn s.charAt() , int or char can not be initial as null,

// 30 分钟自己做出来的, 所以不需要code review 下即可
public class bt_$267_review_PalindromePermutation2 {
    public static void main(String[] args) {
        List list;Map map;
        char a = 'a';
        System.out.println((int)a);
        System.out.println((char)97);
        System.out.println(generatePalindromes("aabb"));

        // todo bug case
        System.out.println(generatePalindromes("aaa"));
    }

    public static List<String> generatePalindromes(String s) {
        List<String> res = new ArrayList<>();
        int[] cnt = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            cnt[cur]++;
        }

        String odd = "";
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] % 2 != 0) {
                if (odd != "") return res;
                cnt[i] -= 1;
                odd = "" + (char)i;
            }
        }

        help(res, "", cnt, 0, odd, s.length());
        return res;
    }

    static void help(List res, String tmp, int[] cnt, int index, String odd, int l) {
        if (tmp.length() * 2 == l || tmp.length() * 2 + 1 == l) {
            res.add(new String(tmp + odd + reverseString(tmp)));
            return;
        }

        for (int i = index; i < 256; i++) {
            if (cnt[i] == 0) {
                continue;
            }
            cnt[i] -= 2;
            help(res, tmp + (char)i, cnt, cnt[i]== 0 ? index + 1 : index, odd, l);
            cnt[i] += 2;
        }
    }

    static String reverseString(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.toCharArray().length; i++) {
            c[c.length - i - 1] = s.toCharArray()[i];
        }
        return new String(c);
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
