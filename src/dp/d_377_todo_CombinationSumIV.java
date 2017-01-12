package dp;

import java.util.Arrays;

 // todo 研习英文解释 https://discuss.leetcode.com/topic/52302/1ms-java-dp-solution-with-detailed-explanation

// todo 本题是一个非常好的例子, dfs => dp

public class d_377_todo_CombinationSumIV {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(new d_377_todo_CombinationSumIV().combinationSum41(new int[]{1,2,3}, 20));
    }

    /*
     */


    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] < 0) break;
                dp[i] += dp[i - nums[j]];
            }
        }
        return dp[target];
    }


    // 此方法效率会高些, 加上dp , 但是由于不是自底向上, 所以上层会有大量计算, 比如 dp[4] = xx + dp[2]
    // 会大量重复出现

    // todo EDIT: The above solution is top-down. How about a bottom-up one?
    static int[]dp;
    public int combinationSum41(int[] nums, int target) {
        Arrays.sort(nums);
        dp = new int[target + 1];
        dp[0] = 1;
        return help(nums, target);
    }


     // dps 方法 然而 tml,
     public int help(int[] nums, int target) {
         if (dp[target] != 0) {
             System.out.println(dp[target]);
             return dp[target];
         }
         if (0 == target) return 1;
         if (0 > target) return 0;
         int res = 0;
         for(int i = 0; i < nums.length; i++) {
             if (target - nums[i] < 0) break;
             res += help(nums, target - nums[i]);
         }
         dp[target] = res;
         return res;
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
 step1 . the first idea is backtracking , however we will find many duplicate calculate

 [1,2,3 ] target = 100
        1        2        3
      1 2 3    1 2 3    1 2 3
 in this case, we can see that the counting of [1,3] and [3,1] will be same ,

 so we should use dp to improve it









 nums = [1, 2, 3]
 target = 4

 dp[4] = { dp[3](cuz nums[1]) + dp[2](cuz nums[2]) + dp[1]...
    dp[3], 1 => dp[3]
 +  dp[2], 2 => dp[2]
 +  dp[1], 3 => dp[1]
 }


 dp[]


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
