package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// todo bug多, 需要重新想好思路
public class a_163_todob_MissingRanges {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        System.out.println(findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));

        // todo bug case
        System.out.println(findMissingRanges(new int[]{1, 1, 1}, 1, 1)); //expected 1

        // todo bug case
        System.out.println(findMissingRanges(new int[]{}, 1, 2)); // expected 1->2
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();

        // todo bug 1
        if (nums.length == 0) {
            if (lower == upper) res.add(lower + "");
            else res.add(lower + "->" + upper);
        }


        for (int i = 0; i < nums.length; i++) {
            int start = - 1, end = -1;
            if (i == 0 && nums[i] != lower) {
                start = lower;
                end = nums[0] - 1;
                if (start == end) res.add(start + "");
                else res.add(start + "->" + end);
            }

            if (i != 0 && nums[i] != nums[i - 1] + 1 && nums[i] != nums[i - 1]) { // todo bug 1 if (i != 0 && nums[i] != nums[i - 1] + 1 todo add &&nums[i] != nums[i - 1]) {
                start = nums[i - 1] + 1;
                end = nums[i] - 1;
                if (start == end) res.add(start + "");
                else res.add(start + "->" + end);
            }

            if (i == nums.length - 1 && nums[i] != upper) {
                start = nums[i] + 1;
                end = upper;
                if (start == end) res.add(start + "");
                else res.add(start + "->" + end);
            }
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
todo 首尾 和当间 分别处理

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