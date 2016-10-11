package math;

public class math_258_addDigits {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        else return num % 9;
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

 TODO translation
 prime : 主要的,基本的 n 精英 主要
 since: 由于


 TODO solotion
 每9个一循环，所有大于9的数的树根都是对9取余，那么对于等于9的数对9取余就是0了

 TODO case

 TODO bug

 b
/*
TODO tutorial


 */
