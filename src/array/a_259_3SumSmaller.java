package array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class a_259_3SumSmaller {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        System.out.println(threeSumSmaller(new int[]{0,0,0}, 1));
    }

    public static int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        // i , j 为起点
        for (int i = 0; i < nums.length - 2; i++) {
            int cnt = 1, sum = 1;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == nums[j - 1]) cnt++;
                else {
                    sum *= cnt;
                    cnt = 1;
                }
                if (nums[j] + nums[j + 1] >= target - nums[i]) {
                    res += (j - i + 2) * (j - i + 1) / 2 / sum;
                    break;
                }
                if (j == nums.length - 2) {
                    res += (j - i + 2) * (j - i + 1) / 2 / sum;
                }
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