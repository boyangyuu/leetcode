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
/**
TODO 思路
 1. O(n)
  a、快慢指针, b、交换方式, c、先 for n, 求可能值再 for n

 2、先排序

 3、插入排序 todo 待复习

 4、空间换时间 ,

 5、注意元素的范围

 6、利用坐标法 (有点忘了)

 7、假想式 ,直接赋值


 */