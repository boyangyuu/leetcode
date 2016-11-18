package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(repeatedSubstringPattern("ababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaa"));
    }

    public static boolean repeatedSubstringPattern(String str) {
        if (str.length() <= 1) return false;
        int j = 0; // repeat end num
        for (int k = 1; k < str.length(); k++) {
            int cur = k % (j - 0 + 1);
            if (str.charAt(cur) != str.charAt(k)) {
                j++;
                k = j + 1;
            }
        }
        return j < str.length() / 2;
    }

    public static boolean repeatedSubstringPattern3(String str) {
        if (str.length() <= 1) return true;
        int j = 0; // repeat end num
        for (int k = 1; k < str.length(); k++) {
            int cur = k % (j - 0 + 1);
            if (str.charAt(cur) != str.charAt(k)) {
                if (str.charAt(k - 1) == str.charAt(0)) j = k - 1;
                else j = k;
            }
        }
        return j == str.length() - 1;
    }


    // wrong
    public static boolean repeatedSubstringPattern1(String str) {
        int[] chars = new int[26];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) chars[str.charAt(i) - 'a']++;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) continue;
            min = Math.min(min, chars[i]);
        }

        if (str.length() % min != 0 || min < 2) return false;
        for (int i = 0; i < min; i++) {

            int t = 1;
            while (min * t + i < str.length()) {
                if (str.charAt(i) != str.charAt(min * t++ + i)) return false;
            }
        }
        return true;
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

 #s0
 kmp!


 ######s1###### todo (wrong)
 (1个指针 j, 代表substring末尾, 有可能repeat 则k++ 否则 直接j = k)

 "ababbaaaaa
  ababbaaaaa
 ababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaa"

 --performance
 time: n
 space: 1

 --data structure
 2 pointers

 --steps





 ######s2######  todo 自己想的很好玩的idea (wrong)
 map 计算字母的最小出现次数, 即为substring 重复次数 (错误)
 case :
 "ababbaaaaa
  ababbaaaaa
  ababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaaababbaaaaa"

 --performance
 time: n
 space: n

 --data structure
 map

 --steps
 记录 每个字母的重复次数
 取最小的次数, 必然为 subtring 的重复次数
 再次检测



 ######sFinal######


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




