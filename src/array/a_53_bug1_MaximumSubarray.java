package array;

import java.util.List;
import java.util.Map;


// todo 想case即可 (res 初始化为多少合适?)
public class a_53_bug1_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        //normal case
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        //todo bug case negative number (contains at least one element)
        System.out.println(maxSubArray(new int[]{-2}));
    }


    public static int maxSubArray(int[] nums) {
        int res = nums[0], tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (tmp < 0) tmp = 0;
            tmp += nums[i];
            res = Math.max(res, tmp);
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