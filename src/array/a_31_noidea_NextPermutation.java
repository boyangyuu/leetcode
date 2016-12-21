package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

// todo 没有思路, 建议复习思路且 必须code
// todo bug 很多
// todo , case 要长些
public class a_31_noidea_NextPermutation {
    public static void main(String[] args) {
        List list;Map map;

        // todo bug case 好的case非常难想
        int[] nums = new int[] {1,2,7,4,3,1};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void nextPermutation(int[] nums) {
        int left = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                left = i;
                break;// todo bug
            }
        }

        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[left]) {
                right = i;
                break;
            }
        }
        int t = nums[left];nums[left] = nums[right];nums[right] = t; // todo bug

        Arrays.sort(nums, left + 1, nums.length);
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
 todo
 step1 find the index i that need to make the value greater, (start from the last element ,
 traverse backward to find the first one with index than num[i] < num[i+1])
 step2 find another index j than make sure minimize the change (start from the last elemet,
 traverse backward to find the first one with index that num[j] > num[i])
 step3 make the remaining higher position part as small as possible, we just have to reverse the num[i+1]--num[l-1]

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