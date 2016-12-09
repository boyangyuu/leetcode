package $;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


// todo 测试有bug ,
// todo 自己想的方法是 n*logn, 有 o(n), o(n) 的方法

public class hs_266_bug1_PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("aab"));
        System.out.println(canPermutePalindrome("aabc"));
        System.out.println(canPermutePalindrome("ababa")); // todo bug case
        System.out.println(canPermutePalindrome("abab"));
        System.out.println(canPermutePalindrome("a"));
        System.out.println(canPermutePalindrome("")); // expected true out also is true
    }

    //s2
    public static boolean canPermutePalindrome(String s) {
        int c = 0, tmp = 0;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i] == chars[i - 1]) {//todo
                tmp++;
            } else {
                if (tmp % 2 == 1) c++;
                tmp = 1;
            }
            if (i == chars.length - 1 ) {
                if (tmp % 2 == 1) c++;
            }
            if (c >= 2) return false;
        }
        return true;
    }

    public static boolean canPermutePalindrome2(String s) {
        //todo HashMap 存count
        return false;

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


 TODO solotion
 hashmap 记录 count即可
奇数count 出现次数>=2次, 则false

 ######s1######
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
