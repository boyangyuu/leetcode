package array;

import java.util.List;
import java.util.Map;

public class a_26_RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        System.out.println(removeDuplicates(new int[]{1,1,2}));

        System.out.println(removeDuplicates(new int[]{0,1,1,4,2,2}));

        System.out.println(removeDuplicates(new int[]{}));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // j points to the last same element
            while (j != nums.length - 1 && nums[j] == nums[j + 1]) j++;
            System.out.println("i: " + i + ", j" + j);
            nums[i] = nums[j];
            if (j == nums.length - 1) return i + 1;
            else j++;
        }
        return 0;
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