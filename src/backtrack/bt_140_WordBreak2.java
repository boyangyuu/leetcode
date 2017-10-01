package backtrack;

import java.util.*;

public class bt_140_WordBreak2 {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }


    public List<String> wordBreak(String s, Set<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dp[j] == 1 && wordDict.contains(sub)) dp[i] = 1;
            }
        }
        // System.out.println(dp[s.length()]);
        List<String> res = new ArrayList<>();
        dfs(res, "", s, wordDict, dp);

        return res;
    }

    public void dfs(List<String> res, String cur, String s, Set<String> wordDict, int[] possibles) {
        if (possibles[s.length()] == 0) return;
        if (wordDict.contains(s)) {
            res.add(new String(s + cur)); // todo bug 1
            // return;
        }
        for (int i = 0; i < s.length() - 1 ; i++) {
            if (possibles[i + 1] == 1) {
                String right = s.substring(i + 1, s.length());
                // System.out.println("right:" + right);
                if (wordDict.contains(right)) {
                    String tmp = " " + right + cur;
                    // System.out.println("left: " + s.substring(0, i + 1));
                    dfs(res, tmp, s.substring(0, i + 1), wordDict, possibles);
                }
            }
        }
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
 dp + backtracking

 --performance
 time: n * n + n * n
 space:
 n

 --data structure
 dp 记录可行的路径 类似wordBreak1 , 建议先去看wordBreak
 根据路径, 进行回溯法组合。

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
 res.add(new String(s + cur)); // todo bug 1
 return;
 =>
 res.add(new String(s + cur)); // todo bug 1

 case:
 "aaaaaaa"
 ["aaaa","aa","a"]
 迭代到时候"a a a", 由于有aaaa 存在, 会直接形成 "a a a aaaa", 从而跳过 "a a a a a a a a "类似这种


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
