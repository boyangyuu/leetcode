package array;

import java.util.Arrays;

public class a_275_hindex2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    //s1
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1;
        while(left <= right){ //todo
            int mid = (right - left) / 2 + left;
            int sum = citations.length - mid;
            int curv = citations[mid];
            if (curv == sum) return sum;
            else if (curv > sum) right = mid - 1;
            else  left = mid  + 1;
        }
        int sum = citations.length - left;
        return sum;
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
 TODO translation
 hindex 一共有 hindex 个数字 >= hindex,

 答案一定存在于 0 - nums.length 中

 TODO solotion
 ######s1######
 --step1 sort
 {0, 1, 3, 5, 6}

 --step 2 attempt from 0
 int h = nums.length; // attempt result
 int sum = 0;// the sum of  >= h elementes
 int i = num.length - 1; // nums[i] < h

 from the end to traverse the nums, until the sum == h

 --step3--
 use binary search to optimize


 ######s2######




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