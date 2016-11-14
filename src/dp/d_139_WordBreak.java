package dp;

import java.util.*;

public class d_139_WordBreak {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    //back tracking  (over time)
    public boolean wordBreak(String s, Set<String> wordDict) {
        return help(s, wordDict);
    }

    public boolean help(String s, Set<String> wordDict) {
        if (wordDict.contains(s)) return true;
        boolean flag = false;
        for (String cur : wordDict){
            int l = cur.length();
            if (s.length() <= l) continue;
            String temp = s.substring(0, l);
            if (wordDict.contains(temp)) {
                flag |= help(s.substring(l, s.length()), wordDict);
            }
        }
        return flag;
    }


    public boolean wordBreak1(String s, Set<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dp[j] == 1 && wordDict.contains(sub)) dp[i] = 1;
            }
        }
        return dp[s.length()] == 1;
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
 tag : dp
 --performance
 time: O(n * n)
 space: On

 --data structure
 dp[i] // string from 0 to i-1 是否满足word break

 --steps
 dp[i] = {
    dp[0] && dict.contains(s.substring(0, i))
    || dp[1] && dict.contains(s.substring(1, i))
    || dp[2] && dict.contains(s.substring(2, i))
    || dp[3] && dict.contains(s.substring(3, i))
 }

 ######s2######
 --performance
 tag : backtracking
 time: O(n*n*n*n ... )
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
