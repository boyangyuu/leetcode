package $;

import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 没想出来思路
public class string_186_todo_ReverseWordsinaString2 {
    public static void main(String[] args) {
        List list;Map map;Set set;
        char[] s = "the sky is blue".toCharArray();
        reverseWords(s);
        System.out.println(s);
    }

    public static void reverseWords(char[] s) {
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1 || s[i + 1] == ' ') {
                help(s, j, i);
                j = i + 2;
            }
        }

        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = t;
        }
    }

    public static void help(char[] s, int i, int j) {
        while (i < j) {
            char t = s[i];
            s[i++] = s[j];
            s[j--] = t;
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

 time:o(n)
 space:
每个string 翻转一下, 整体翻转一下


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




