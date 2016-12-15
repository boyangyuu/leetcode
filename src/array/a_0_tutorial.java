package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class a_0_tutorial {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        // print
        int[] nums1 = Arrays.copyOfRange(nums, 1, 3); // from index 1 to 2
        System.out.println(Arrays.toString(nums1));

        // Arrays.sort([], com); String
        Integer[] list = new Integer[nums.length];
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                return (s1 + s2).compareTo(s2 + s1); // todo
            }
        };
        Arrays.sort(list, com);        // Arrays.sort(, com) 后面可接comparer
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