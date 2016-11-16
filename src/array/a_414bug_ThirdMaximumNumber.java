package array;

import java.util.PriorityQueue;
import java.util.Queue;

public class a_414bug_ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};

        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    // s1 heap

    // s2 3 long
    public int thirdMax(int[] nums) {
        long num1 = Long.MIN_VALUE , num2 = Long.MIN_VALUE, num3 = Long.MIN_VALUE; // todo 用long
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1 || nums[i] == num2 || nums[i] == num3) continue;
            if (nums[i] > num1) {
                num3 = num2;
                num2 = num1;
                num1 = nums[i];
            } else if (nums[i] > num2) {
                num3 = num2;
                num2 = nums[i];
            } else if (nums[i] > num3) {
                num3 = nums[i];
            }
        }
        return num3 == Long.MAX_VALUE ? (int)num1 : (int)num3;
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


 TODO solotion recommended
 ######s1######
 todo use heap

 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 num1,num2,num3

 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######

 TODO case

 TODO bug
 int num1 = Integer.MIN_VALUE , num2 = Integer.MIN_VALUE, num3 = Integer.MIN_VALUE; // todo 用long
 =>
 long num1 = Long.MIN_VALUE , num2 = Long.MIN_VALUE, num3 = Long.MIN_VALUE; // todo 用long

 case [0,1,MIN_VALUE]

 TODO follow
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */