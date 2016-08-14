package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a_18_4Sum$hash {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(a_18_4Sum$hash.fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();

        //step1 sort
        Arrays.sort(nums);

        //step2 settle 2 items
        for (int i1 = 0; i1 < nums.length - 3; i1++) { //!bug1
            if (i1 > 0 && nums[i1] == nums[i1 -1]) continue;  //!bug1
            for (int i2 = i1 + 1; i2 < nums.length - 2; i2++) { //!bug2
                if (i2 > (i1 + 1) && nums[i2] == nums[i2 -1]) continue; //bug3

                //step3
                int dest = target - nums[i1] - nums[i2];
                int i3 = i2 + 1;
                int i4 = nums.length -1;
                while(i3 < i4) {
                    if (i3 > i2 + 1 && nums[i3] == nums[i3 - 1]) {
                        i3++;
                        continue;
                    }

                    if (nums[i3] + nums[i4] == dest) {
                        List<Integer> list = new ArrayList();
                        list.add(nums[i1]);
                        list.add(nums[i2]);
                        list.add(nums[i3]);
                        list.add(nums[i4]);
                        i3++; //bug4
                        i4--;
                        result.add(list);
                    } else if (nums[i3] + nums[i4] > dest){
                        i4--;
                    } else {
                        i3++;
                    }

                }
            }
        }

        return result;
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

思路 : 降为 2sum , hash存所有2者之和,

 */