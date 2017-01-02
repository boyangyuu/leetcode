package array;

import java.util.*;

// 建议过思路
// todo 12/14 12:30 - 12.53 bug 3

//todo 难点在于如何比较两个数字, 本题有非常巧妙的思路


public class a_179_slow_LargestNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        System.out.println(largestNumber(new int[]{10,211,11,3}));
        System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));

        //todo bug 3case
        System.out.println(largestNumber(new int[]{3, 30})); // expected 330 output 303 (3,30 很难比较)

        System.out.println(largestNumber(new int[]{999999998,999999997,999999999}));

        System.out.println(largestNumber(new int[]{0,0}));

    }

    public static String largestNumber(int[] nums) {
        Integer[] list = new Integer[nums.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = nums[i];
        }
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                return (s1 + s2).compareTo(s2 + s1); // todo 思路
            }
        };
        Arrays.sort(list, com);
//        System.out.println(Arrays.toString(list));

        String res = "";
        if (list[list.length-1] == 0) return "0";
        for (int i = 0; i < list.length; i++) {
            res = list[i] + res;
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