package math;

import java.util.HashMap;

public class math_12_IntegertoRoman {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public String intToRoman(int num) {
        String res = "";
        int[] vals = {1, 4, 5, 9,  10, 40, 50, 90,  100, 400, 500, 900,  1000};
        String[] cs = {"I", "IV", "V", "IX",  "X", "XL", "L", "XC",  "C", "CD", "D", "CM",  "M"};
        for (int i = vals.length - 1; i >= 0; i--) {
            while (num >= vals[i]) {
                num -= vals[i];
                res += cs[i];
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

 1 4 5 9 为关键节点, 本题记住就好

 {"I", "VI", "V", "IX",  "X", "XL", "L", "XC",  "C", "CD", "DC", "CM",  "M"};
 答案一定由这组字符串组成



 贪婪法, 每次尝试用 候选项中尽量大的



 遍历构造的 关键数值


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial


 */
