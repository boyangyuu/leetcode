package array;

import java.util.List;
import java.util.Map;

// todo 记住方法 (两边往中间走, 两者较小者, 淘汰掉, 向内移动)

public class a_11_todo_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        System.out.println(maxArea(new int[]{10,9,11,7}));
    }

    public static int maxArea(int[] height) {
        int res = 0, i = 0, j = height.length - 1;
        while (i < j) {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++; // todo 淘汰 较小者, 因为 较小者(h) 无论与任何其他值(j 更小) 匹配, 都是(<=h) * (j-i)
            else j--;
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