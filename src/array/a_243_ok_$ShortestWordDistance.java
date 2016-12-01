package array;

import java.util.List;
import java.util.Map;

// 第一次就一遍过
public class a_243_ok_$ShortestWordDistance {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;

        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "coding", "practice"));

        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "makes", "coding"));
    }

    public static int shortestDistance(String[] words, String word1, String word2) {
        int i1 = -1, i2 = -1, res = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) i1 = i;
            if (words[i].equals(word2)) i2 = i;

            // both found
            if (i1 != - 1 && i2 != -1) res = Math.min(res, Math.abs(i1 - i2));
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