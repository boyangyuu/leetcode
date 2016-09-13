package dp;

import java.util.*;

public class d_120_Triangle {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        for (int i = triangle.size() - 1; i > 0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                int cur = list.get(j);
                if (i == triangle.size() - 1) dp[j] = cur;
                else {
                    dp[j] = Math.max(dp[j], dp[j-1]) + cur;
                }

            }
        }


        return dp[0];
    }

}
/** 题
 *
 * http:
 *
 Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 if (i != 0)
f(n , i-1) = min( f(n-1, i-1), f(n-1, i)  + x[l-n][i]
else
 f(n , i) = f(n-1, i) + x[l-n][i]

 until n = l

 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */