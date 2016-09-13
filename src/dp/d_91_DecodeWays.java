package dp;

public class d_91_DecodeWays {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        String s = "121212";
        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return s.charAt(0) == '0' ? 0 : 1;
        int[] dp = new int[s.length()];
        dp[0] = s.charAt(0) == '0' ? 0 : 1;
        if(s.charAt(0) == '0')dp[1] = 0;
        else if(s.charAt(0) - '0' > 2 && s.charAt(1) == '0') dp[1] = 0;
        else if(s.charAt(0) - '0' == 1 && s.charAt(1) != '0' || s.charAt(0) - '0' == 2 && s.charAt(1) - '0' < 7 && s.charAt(1) != '0') dp[1] = 2;
        else dp[1] = 1;
        for (int i = 2; i < s.length(); i++) {
            dp[i] = 0;                   //todo 数组初始化默认为0, 这行可以不写 只是为了可读性
            if (s.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            } else if (isAdd(s, i)) { //todo bug
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length() - 1];
    }


    // check if can add dp(n-2)
    public static boolean isAdd(String s, int i){
        int c1 = s.charAt(i-1) - '0';   //TODO 重点 char 转 int 或者  '?' - '0'
        int c2 = Integer.parseInt(s.substring(i,i+1));   //TODO 教学 subtring 参数1 第一个字符的位置(from 1) 第二个字符的位置
        int v = c1 * 10 + c2;
        if (c1 == 0) {
            return false;
        }
        if (10 <= v && v < 27) { // 10-26
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
 https://discuss.leetcode.com/topic/35840/java-clean-dp-solution-with-explanation
 https://discuss.leetcode.com/topic/54450/2ms-java-dp-solution

 思路 :
如何迭代

 错误:
 f(n)
 10 <26 : f(n-1) + f(n-2)
 else   : f(n-1)

 正确:
 f(n) = 0;
 x[n] != 0 : f(n) +=f(n-1)
 x[n-1] != 0 && ( x[n-1],x[n] 可以组合为1个字母 )   : f(n) += f(n-2)   1 2 [3] => 1, 2, [3] 和 1, [23]

方法不够简洁!!

 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */