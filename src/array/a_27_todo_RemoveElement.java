package array;

import java.util.List;
import java.util.Map;


// todo 需要学习最佳思路
public class a_27_todo_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        System.out.println(removeElement1(new int[]{3,2,2,3}, 3));
    }

    public static int removeElement1(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i++)
            if(nums[i] != val) nums[res++] = nums[i];
        return res;
    }

    //垃圾方法
    public static int removeElement(int[] nums, int val) {
        int j = 0, l = nums.length; // 不是 val 的element
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] == val) {
                j++;
                l--;
            }
            if (j == nums.length) break;
            nums[i] = nums[j++];
        }
        return l;
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