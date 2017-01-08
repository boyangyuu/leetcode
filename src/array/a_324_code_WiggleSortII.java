package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


// todo 本题 类似于 wigglesort , 先排序后操作这个很好想 难点在于重复数字的问题, 既然有重复数字,
// todo 那么我们取值的时候, 就横跨多个取, 比如排序后, 1,1,1,4,5,6 那么 横跨三个, (0位3位1位4位)=> 1,4,1,5,1,6
// todo
//
// todo!! 重复元素 不可能存在连续 n/2 个 , 故要注意再分配的排序
// 思路1 分别从0,3开始 case 011123 : 0112 错 a[0] a[3] a[1] 。。。 注意 a[3] 与a[1] 可能会交叉
// 思路2 分别从 2,5 倒序开始 131201 为什么这种就好使?? cuz : a[2] a[5] a[1] a[4] a[0] a[3] todo 没有能交叉的可能!!!!

// 奇数情况 01 123  13120

// todo learn 如何快速取mid , int mid = (n + 1) / 2

public class a_324_code_WiggleSortII {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        int[] nums1 = new int[]{0,1,1,2,3};
        wiggleSort(nums1);
        System.out.println(Arrays.toString(nums1));
        int[] nums2 = new int[]{0,1,1,1,2,3};
        wiggleSort(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] tmp = nums.clone();
        int mid = (nums.length + 1) / 2 - 1; // todo learn  技巧
        int last = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 ) nums[i] = tmp[mid--];
            else nums[i] = tmp[last--];
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