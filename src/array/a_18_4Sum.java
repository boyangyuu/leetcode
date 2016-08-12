package array;

import java.util.*;

public class a_18_4Sum {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        // 排序 以便递归最后1个数字时候 可以优化算法
        Arrays.sort(nums);

        // 固定前三个值 反求第四个
        for (int i1 = 0; i1 < nums.length; i1++) {
            int a1 = nums[i1];
            for (int i2 = 1; i2 < nums.length; i2++) {
                int a2 = nums[i2];


            }
        }


        return null;
    }
}
/** 题
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
 * o(n3), O(n)
 *
 *
 *
 参考网站 : http://blog.csdn.net/doc_sgl/article/details/12462151



 */