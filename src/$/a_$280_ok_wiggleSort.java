package $;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class a_$280_ok_wiggleSort {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        int[] nums1 = {1,2,3,3,4,5};
        wiggleSort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i += 2) {
            int tmp = nums[i - 1];
            nums[i - 1] = nums[i];
            nums[i] = tmp;
        }
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