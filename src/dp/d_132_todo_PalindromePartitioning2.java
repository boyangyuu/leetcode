package dp;

public class d_132_todo_PalindromePartitioning2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    /*
        一维dp
        todo 没有研究
    */
    public int minCut(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] cut = new int[n];
        boolean[][] pal = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = 0; j <= i; j++) {
                if(c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
                    pal[j][i] = true;
                    min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
                }
            }
            cut[i] = min;
        }
        return cut[n - 1];
    }


    /*
    todo 研究区间dp写法

todo 参考 http://www.cnblogs.com/qq-star/p/4161143.html
    区间dp (time exceed)
    dp[i][j] = Min{
        if isP(i, j) return 0;
        dp[i][i] + dp[i+1][j];
        dp[i][i+1] + ...
        dp[i][j-1] + dp[j][j] + 1
    }


    code :
    i, j 用小的合并
    -- 11 , 22 , 33, 44
    -- 12(11合并22), 23(22-33), 34, 45
    -- 13, 24(22-),
    */
    public int minCut2(String s) {
        int l = s.length();
        int[][] dp = new int[l][l]; // dp[i][j] : the minCut of s[i,j] inclusively

        for(int sl = 0; sl < l; sl++) { // 长度,
            for (int i = 0; i < l && i + sl < l; i++) { // 起点
                int j = i + sl;                 // 终点
                if (dp[i][j] == 0) dp[i][j] = Integer.MAX_VALUE;
                if (i == j) dp[i][j] = 0;
                else if (isPalindrome(s.substring(i, j + 1)))
                    dp[i][j] = 0;
                else {
                    for (int k = i; k < j; k++)
                        dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k + 1][j]);
                }
            }
        }
        return dp[0][l - 1];
    }


    // greedy, from the left or right, find the lengthest one, then recursive to find substring, not ok , case  a..........b
    public int minCut1(String s) {
        if (isPalindrome(s)) return 0;
        int min = -1;
        for(int i = s.length() - 1; i >= 0; i--) {
            if (isPalindrome(s.substring(0, i + 1))) {
                return  1 + minCut(s.substring(i + 1, s.length()));
            }
            int j = s.length() - 1 - i;
            if (isPalindrome(s.substring(j, s.length()))) {
                return  1 + minCut(s.substring(0, j));
            }
        }
        return 0;
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
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
 --performance
 time:
 space:

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

 bug1
 bug2
 bug3
 */

