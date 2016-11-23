package dp;


// todo 用stack做 别用dp!
public class d_32_LongestValidParentheses {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    // dp
    public int longestValidParentheses(String s) {
        return 0;
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
 ######s1######
 dp
 --performance
 time: n
 space: n

 --data structure
 dp[i] : ends with s[i], the length

 dp[i + 1] = {
    0
 }
 http://bangbingsyb.blogspot.com/2014/11/leetcode-longest-valid-parentheses.html

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
 */

/*
TODO tutorial
 dp指代 , 一共分2种情况
  1、dp[n]代表着最优解解 和
  2、max{dp[1],,,dp[n]} 为最优解 其中dp[i] 代表着end with x[i] 时的解

 dp解空间, 大概也分2种
  1、 dp = max{dp[n-1], dp[n-2]}
  2、 dp = max {
        dp[j1]
        dp[j2]    // under some condition
        ....
  }

 */
