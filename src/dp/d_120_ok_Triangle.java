package dp;

import java.util.*;

// todo 若想空间为n , 方法一 倒着形成dp, 方法2 每次备份
public class d_120_ok_Triangle {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List<List<Integer>> t = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>(); l1.add(2);
        List<Integer> l2 = new ArrayList<>(); l2.add(3);l2.add(4);
        List<Integer> l3 = new ArrayList<>(); l3.add(6);l3.add(5);l3.add(7);
        t.add(l1);t.add(l2);t.add(l3);
        System.out.println(minimumTotal3(t));
    }

    public static int minimumTotal3(List<List<Integer>> triangle) {
//        int[][] dp = new int[triangle.size()][triangle.size()];
        int[] dp = new int[triangle.size()];
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < triangle.size(); i++) {

            int[] dpTemp = new int[dp.length];
            for (int k = 0; k < dpTemp.length; k++)
                dpTemp[k] = dp[k]; // todo 方法2


            for (int j = 0; j <= i; j++) {
                int cur = triangle.get(i).get(j);
                if (i == 0) dp[j] = cur;
                else if (j == 0) dp[j] = cur + dpTemp[j];
                else if (j == i) dp[j] = cur + dpTemp[j - 1]; // temp 避免 拿到新值
                else dp[j] = cur + Math.min(dpTemp[j], dpTemp[j - 1]);
                if (i == triangle.size() - 1) res = Math.min(res, dp[j]);
            }
        }
        return res;
    }



    public static int minimumTotal1(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {
                int cur = triangle.get(i).get(j);
                if (i == 0) dp[i][j] = cur;
                else if (j == 0) dp[i][j] = cur + dp[i - 1][j];
                else if (j == i) dp[i][j] = cur + dp[i - 1][j - 1];
                else dp[i][j] = cur + Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                if (i == triangle.size() - 1) res = Math.min(res, dp[i][j]);
            }
        }
        return res;
    }














    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        for (int i = triangle.size() - 1; i > 0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                int cur = list.get(j);
                if (i == triangle.size() - 1) dp[j] = cur;
                else {
                    dp[j] = Math.min(dp[j], dp[j-1]) + cur;
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

todo solution
 if (i != 0)
f(n , i-1) = min( f(n-1, i-1), f(n-1, i)  + x[l-n][i]
else
 f(n , i) = f(n-1, i) + x[l-n][i]

 until n = l

todo bug
 bug1
 bug2
 bug3
 */