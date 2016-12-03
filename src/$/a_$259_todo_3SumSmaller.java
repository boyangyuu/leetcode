package $;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// todo 复习思路 (记住数字可以相同的case)花费了很多时间。。。 (早点想到按照排列组合做 会好些)
public class a_$259_todo_3SumSmaller {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        System.out.println(threeSumSmaller(new int[]{0,0,0}, 1));
        System.out.println(threeSumSmaller(new int[]{1,1,2,3}, 6));
    }

    public static int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        // i , j 为起点
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            int t = target - nums[i];
            while (j < k) {
                if (nums[k] + nums[j] < t) res += k - j++;
                else k--;
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