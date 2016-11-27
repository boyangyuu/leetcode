package array;

import java.util.List;
import java.util.Map;


// todo 不是特别熟练 建议再code一遍以后
// todo 主要利用双指针
public class a_26_todo_RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        System.out.println(removeDuplicates1(new int[]{1,1,2}));

        System.out.println(removeDuplicates1(new int[]{0,1,1,4,2,2}));

        //case null
        System.out.println(removeDuplicates1(new int[]{}));

        // todo bug case if => while
        System.out.println(removeDuplicates1(new int[]{1,1,1}));

    }

    public static int removeDuplicates1(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i != nums.length - 1 && nums[i + 1] == nums[i]) i++; //todo bug if =>while
            nums[res++] = nums[i];
        }
        return res;
    }

    //垃圾方法
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
 if (i != nums.length - 1 && nums[i + 1] == nums[i]) i++; //todo bug if =>while
 =>
 while (i != nums.length - 1 && nums[i + 1] == nums[i]) i++; //todo bug if => while

 bug2

 bug3
 */

/*
TODO tutorial


 */