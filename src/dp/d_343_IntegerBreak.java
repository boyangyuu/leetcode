package dp;

public class d_343_IntegerBreak {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


    //dp
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) { // todo bug1
            int max = 0;
            for (int j = 1; j < i / 2; j++) { // todo bug2
                int temp = Math.max(dp[j], j) * Math.max(dp[i-j], i-j);
                max = Math.max(max, temp);
            }
            dp[i] = max;
        }
        return dp[n+1];
    }

    //math
    public int integerBreak2(int n) {
        if (n == 2 || n == 3) return n - 1;
        int res = 1;
        while (n > 4) {
            res *= 3;
            n -= 3;
        }
        return res * n;
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


 dp[i] = max{     // j1 from 1 to i/2
    max(dp[j1], j1) * max(dp[j2], j2) ; j1 + j2 = i
 }


 方法2 mathematics
 数字3可以拆分成2+1或1+1+1，显然第一种拆分方法乘积大为2。

 数字4拆成2+2，乘积最大，为4。

 数字5拆成3+2，乘积最大，为6。

 数字6拆成3+3，乘积最大，为9。

 数字7拆为3+4，乘积最大，为12。

 数字8拆为3+3+2，乘积最大，为18。

 数字9拆为3+3+3，乘积最大，为27。

 数字10拆为3+3+4，乘积最大，为36。

 一定有3 拆 3, , 一直拆到 1~4 , 不需要拆


 TODO case

 TODO bug

 bug1

 bug2
 j from 1 not 2 , cuz if from 2 it will be never excute if input is 3!

 bug3
 */