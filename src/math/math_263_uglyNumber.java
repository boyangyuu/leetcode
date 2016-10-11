package math;

public class math_263_uglyNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

}
/** 题
 *

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 TODO translation
 prime : 主要的,基本的 n 精英 主要
 

 TODO solotion

 TODO case

 TODO bug

TODO tutorial


 */
