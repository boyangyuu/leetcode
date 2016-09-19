package dp;

import java.lang.reflect.Array;
import java.util.*;

public class d_368_LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ret = new ArrayList();
        if (nums.length == 0) return ret;
        List[] dp = new List[nums.length];

        Arrays.sort(nums);
        //System.out.println(nums[3]);
        int maxIndex = 0;
        int maxLength = 0;  //todo bug2
        for (int i = 0; i < nums.length; i++) {
            dp[i] = new ArrayList();
            dp[i].add(0, nums[i]); // todo bug1!!!
            for (int j = 0; j < i; j++) {
                List<Integer> cur = dp[j];
                if (nums[i] % cur.get(0) == 0 && (cur.size() + 1) > dp[i].size()) {
                    dp[i].clear();
                    dp[i].addAll(cur);
                    dp[i].add(0,nums[i]);
                    //System.out.println("i: " + i + ", size:" + dp[i].size());
                }
            }

            if (dp[i].size() > maxLength) {
                maxIndex = i;
                maxLength = dp[i].size();
            }
        }

        return dp[maxIndex];
    }

}
/** 题
 *
 * http:
 *
 Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies: Si % Sj = 0 or Sj % Si = 0.

 If there are multiple solutions, return any subset is fine.

 Example 1:

 nums: [1,2,3]

 Result: [1,2] (of course, [1,3] will also be ok)
 Example 2:

 nums: [1,2,4,8]

 Result: [1,2,4,8]

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 TODO solotion
 dp[n] stands for ends with x[n] subway
 dp[n] = max{
    dp[j1] + x[n]            // x[n] % dp[j].endElement == 0
    dp[j2] + x[n]
    ..
 }
todo alert:  if input is {1} the answer is {1}, not {} means Si Sj ,i can equals to j

 TODO case

 TODO bug

 bug1
 任何一个dp[i] 都至少有1个

 bug2
  do not forget to update
 bug3
 */