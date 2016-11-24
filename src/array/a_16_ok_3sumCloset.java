package array;

import java.util.*;

// todo bug case {0,0,0,0} 题目要求是 unique answer
public class a_16__3sumCloset {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        // case normal
        System.out.println(threeSumClosest(new int[]{-2, 0, 1, 2, -2, -4}, 2));

        // todo case {0,0,0,0}
        System.out.println(threeSumClosest(new int[]{0,0,0,0,0}, 2));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0, diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int a = i + 1, b = nums.length - 1;
            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    res = sum;
                }
                if (sum == target) return res;
                else if (sum < target) a++;
                else b--;
            }
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

 TODO follow
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */