package dp;

import java.lang.reflect.Array;

public class d_322_CoinChange {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];  // todo bug1
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            dp[i]= amount + 1;  // todo bug3
            for (int j = 0; j < coins.length; j++) {
                if(i >= coins[j])
                    dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);  //MAX_VALUE + 1 会成为负数
            }
            System.out.println("dp " + i + " " + dp[i]);
        }
        return dp[amount] == (amount + 1) ? -1 : dp[amount];         //todo bug1
    }

    // easy to understand
    public int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];  // todo bug1
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            dp[i]= -1;  // todo bug3
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if(i >= coins[j] && dp[i-coins[j]] != -1){
                    min = Math.min(min, dp[i-coins[j]] + 1);
                }
            }
            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
            System.out.println("dp " + i + " " + dp[i]);
        }
        return dp[amount];         //todo bug1
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
 coins
 dp[i] : target as i, the minest times
 dp[i] = min{
    dp[i - coins[0]] + 1,
    dp[i - coins[1]] + 1,   // 比如 dp[i - coins[1]] 是无解的, 其为MAX_VALUE 所以 dp 不会因为其变化
    ..
 }


 or better to understand

 dp[i] = min{
    dp[i - coins[0]] + 1,
    //dp[i - coins[1]] + 1,   // if dp[i - coins[1]] == -1
 ..
 }

 todo !
 dp



 TODO case

 TODO bug

 bug1
 这样才能 使用 dp[amount] 代表 sum为amount时候的times
 bug2
 bug3
 取最小值用
 */