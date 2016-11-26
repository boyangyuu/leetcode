package array;

import java.util.*;

// todo 能否进一步优化?到 On * n
public class a_18_ok_4Sum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int t = target - nums[i] - nums[j];
                int a = j + 1, b = nums.length - 1;
                while (a < b) {
                    if (nums[a] + nums[b] == t) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);list.add(nums[j]);list.add(nums[a]);list.add(nums[b]);
                        set.add(list);
                        a++;b--;
                    } else if (nums[a] + nums[b] < t) a++;
                    else b--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
/** 题
 *
 * http://lifexplorer.me/leetcode-3sum-4sum-and-k-sum/
 *
 Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
 Find all unique quadruplets in the array which gives the sum of target.

 Note: The solution set must not contain duplicate quadruplets.

 For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

 A solution set is:
 [
 [-1,  0, 0, 1],
 [-2, -1, 1, 2],
 [-2,  0, 0, 2]
 ]

 */

/** Solution
 * 时间 o(nlogn + n³) 空间 (2)
 *
 *
 *
 参考网站 : https://discuss.leetcode.com/topic/33182/java-backtracking-solution-for-k-sum-beat-94/2

思路 : k Sum => 固定 k-2 个数字 求 另两个之和 n * n * ( n )
排序后 求两个之和= dest 只需要 n, 因为前后分别移动即可

 步骤1 排序
 步骤2 固定 a[i1] a[i2] , 取另外两者之和为 value - a[i] -a[j] 方法 返回答案数组
 步骤3 拼接 a[i1] a[i2] 形成答案

 注意1 a[i1] 是从 0 到 length - 3, 且需要去重 重复的话需要continue
 注意2 a[i2] 是从 i1 开始
 注意3
 */