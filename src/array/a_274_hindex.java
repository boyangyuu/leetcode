package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class a_274_hindex {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    //s1 Time: logn*n + n Space : 1
    public int hIndex(int[] citations) {
        Arrays.sort(citations, citations.length-1, 0);
        System.out.println(citations[0]);
        int h = citations.length;
        int sum = 0;
        int i = citations.length - 1;
        while (i >= 0) {
            if (h >= citations[i]) {
                sum++;
                i--;
            } else h--;
            if (sum == h) return h;
        }
        return h;
    }

    //s2 use binarySearch to optimize
//    public int hIndex1(int[] citations) {
//        int left = 0, right = citations.length - 1;
//        while(left < right){
//            int mid = (right - left) / 2 + left;
//            int sum = citations.length - mid;
//            int curv = citations[mid];
//            if (curv >= sum) return sum;
//            else if (sum < curv)
//        }
//
//    }

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



 ######s2######
 int hIndex(vector<int>& citations) {
 sort(citations.begin(), citations.end(), greater<int>());

 降序摆列, 当序列数大于 当前值, 即为所得
 for (int i = 0; i < citations.size(); ++i) {
 if (i >= citations[i]) return i;
 }
 return citations.size();
 }



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