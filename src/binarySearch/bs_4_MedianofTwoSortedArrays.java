package binarySearch;


import java.lang.reflect.Array;
import java.util.Arrays;

// todo 思路没有, 代码很难 (static 换成 正常 否则容易超时)
public class bs_4_MedianofTwoSortedArrays {
    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{1,3,4}, new int[]{2,5}));
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2,5})); // todo bug1 expected 2.5 putput 2 cuz int / int == int

        System.out.println(getK(new int[]{1,3}, new int[]{2,5}, 2));
        System.out.println(getK(new int[]{1,3}, new int[]{2,5}, 3));

        System.out.println(getK(new int[]{1,3,4}, new int[]{2,5}, 4));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        if (l % 2 == 0) return (getK(nums1, nums2, l / 2) + getK(nums1, nums2, l / 2 + 1)) / 2.0 ; // todo bug1 除以2.0
        else return getK(nums1, nums2, l / 2 + 1);
    }

    public static int getK(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0) return nums2[k - 1];
        if (nums2.length == 0) return nums1[k - 1];
        if (k == 1) return Math.min(nums1[0], nums2[0]);

        int i1 = Math.min(nums1.length, k / 2);
        int i2 = Math.min(nums2.length, k / 2);
        if (nums1[i1 - 1] < nums2[i2 - 1]) {
            return getK(Arrays.copyOfRange(nums1, i1, nums1.length), nums2, k - i1);
        } else {
            return getK(nums1, Arrays.copyOfRange(nums2, i2, nums2.length), k - i2);
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
 思路用分治法, (切割法)
 nums1 : 1,3,4,9,10
 nums2 : 2,5,6,7
 k = 5 (找出5th 的元素)
 i1 , i2 = k / 2 ;//(2)

 则 target 必然不在 {1,3} 或者 {2,5} 中, (但可能在{1,3,4} 中, 因为可能存在{1,2,3,5,4} 4为最大值)
 若 nums[i1] < nums[i2] {1,3} 可以抛弃, 继续找 (k-2)th元素
 //todo=>  </> getK({4,9,10} , {2,5,6,7}, 5-2)
 反之亦然

 直到k被减到为1, 比较

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
