package dp;

public class d_91_DecodeWays {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        String s = "121212";
        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        if (s.length() <= 1) return 1;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        dp[1] = help(s, 1) ? 2 : 1;
        for (int i = 2; i < s.length(); i++) {
            if (help(s, i)) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[s.length() - 1];
    }

    public static boolean help(String s, int i){
        if (i < 1) return false;
        int c1 = Integer.parseInt(s.substring(i-1,i));   //TODO 重点 char 转 int
        int c2 = Integer.parseInt(s.substring(i,i+1));   //TODO 教学 subtring 参数1 第一个字符的位置(from 1) 第二个字符的位置
        //System.out.println("c1: " + c1 + " ,c2: " + c2);
        if (c1 == 1 || c1 == 2 && c2 < 7) { // 10-26
            return true;
        } else
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

 思路 :
如何迭代

 f(n)
 10 <26 : f(n-1) + f(n-2)
 else   : f(n-1)



 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */