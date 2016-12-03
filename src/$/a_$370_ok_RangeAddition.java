package $;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class a_$370_ok_RangeAddition {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
        int[] res = getModifiedArray(5, new int[][]{{1,  3,  2}, {2,  4,  3}, {0,  2, -2}});
        System.out.println(Arrays.toString(res));

    }

    public static int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for (int i = 0; i < updates.length; i++) {
            for (int j = updates[i][0]; j <= updates[i][1]; j++) {
                res[j] += updates[i][2];
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