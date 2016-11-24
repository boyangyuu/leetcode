package array;

import java.util.*;

// todo bug case {0,0,0,0} 题目要求是 unique answer
public class a_15_bug2_3sum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        // case normal
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

        // todo case {0,0,0,0}
        System.out.println(threeSum(new int[]{0,0,0,0,0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>(); // todo bug 1 用set去重 别尝试别的方法

        for (int i = 0; i < nums.length; i++) {
            int target = - nums[i];
            int a = i + 1, b = nums.length - 1;
            while (a < b) {
                if (target == nums[a] + nums[b]) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);cur.add(nums[a]);cur.add(nums[b]);
                    res.add(cur);
                    a++;b--;
                } else if (target > nums[a] + nums[b]) a++;
                else b--;
            }
        }
        return new ArrayList<>(res);
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