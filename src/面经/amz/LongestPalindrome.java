package 面经.amz;

import java.util.*;
/*

https://leetcode.com/problems/longest-palindrome/

 */
/**
 * Created by yuboyang on 2/20/17.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        int cnt = 0;
        for (Character c : map.keySet()) {
            cnt += map.get(c) % 2 == 0 ? map.get(c) : map.get(c) - 1;
        }
        return cnt == s.length() ? cnt : cnt + 1;
    }
}
