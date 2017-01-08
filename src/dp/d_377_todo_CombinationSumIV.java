package dp;

import java.util.Arrays;

public class d_377_todo_CombinationSumIV {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
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


     // dps 方法 然而 tml,
     public int help(int temp, int[] nums, int target) {
         if (temp == target) return 1;
         if (temp > target) return 0;
         int res = 0;
         for(int i = 0; i < nums.length; i++) {
             temp += nums[i];
             if (temp > target) break;
             res += help(temp, nums, target);
             temp -= nums[i];
         }
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
