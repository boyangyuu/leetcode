package dp;



/*
用dp方法
todo 这道题惨绝人寰!
 */
//todo 记住思路 和 case,,,注意 各种case 在代码里都有标记 主要要考虑 00 和 30 这种情况(出现则return 0)
// 结尾为0时, 是dp[i] = dp[i-1] 这个case总忘
public class d_91_todo_DecodeWays {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        String s = "121212";
//        System.out.println(numDecodings(s));
    }

    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '0' || s.charAt(i - 1) >= '3') return 0;  // case "...00" || "...130"
                else if (i == 1) dp[i] = s.charAt(i - 1) <= '2' ? 1 : 0; // case "10","30"
                else dp[i] = dp[i - 2]; // case "...10"
            } else if (s.charAt(i - 1) == '0' || s.charAt(i - 1) >= '3' || s.charAt(i - 1) == '2' && s.charAt(i) > '6') { //case "31","24"
                dp[i] = dp[i - 1];
            } else {
                if (i == 1) dp[i] = 2;
                else dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[s.length() - 1];
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
 https://discuss.leetcode.com/topic/35840/java-clean-dp-solution-with-explanation
 https://discuss.leetcode.com/topic/54450/2ms-java-dp-solution

todo solution
 s1
 tag : dp
 d[i] : 以 string[i] 为结尾的 题解
 公式
 dp[i] = {
    if (s[i]) == 0
        if (s[i-1]) == 0 || s[i-1] >=3) dp[i] = 0;
        else dp[i] = dp[i-2]
    else if (s[i-1],s[i]) >= 23 dp(i) = dp(i-1)
    else dp(i) = dp(i-1) + dp(i-2)
 }



方法不够简洁!!

todo case
 case1
 input : 0
 output : 0

todo bug
 bug1
 bug2
 bug3
 */