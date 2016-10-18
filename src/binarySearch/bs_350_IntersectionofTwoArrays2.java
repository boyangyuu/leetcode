package binarySearch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bs_350_IntersectionofTwoArrays2 {
    public static void main(String[] args) {


    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;j++;
            }
            else if (nums1[i] < nums2[j]) i++;
            else j++;
        }

        int[] res = new int[list.size()];
        for (int k = 0; k < res.length; k++) {
            res[i] = list.get(k);
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


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
