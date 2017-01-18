package binarySearch;

import java.util.List;
import java.util.Map;


// todo 多练习二分插入 remeber the binary search code for 可重复的 elements

public class bs_34_todo_searchForARange {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        // todo bugcase 1
        int[] res = searchRange(new int[]{7,7,7}, 6);
        System.out.println(res[0]);

    }

   /*
    one thing is for sure that we must use binary search to satisfy the time complexity of O(logn)

    step 1. we need to find the first element which is bigger than 8, it is 10.
    the pseudocode ['sju:dəʊˌkəʊd] is below
    // code
    while(i <= j) {
        if (nums[mid] todo!! <= target) i = mid + 1; // <=或者>=的 判断处才有可能达到大于或小于 的index
        else j = mid - 1;
    }
    if (i == 0 || nums[i - 1] != target) return res; // todo bug
    res[1] = i - 1;
    //

    then we will get the right edge of the target (res[i]) , the corner case is i == nums.legnth(not found)

    */



    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums.length < 1) return res;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) i = mid + 1;
            else j = mid - 1;
        }
        if (i == 0 || nums[i - 1] != target) return res;
        res[1] = i - 1;

        i = 0; j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        if (j == nums.length - 1 || nums[j + 1] != target)  return res;
        res[0] = j + 1;
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