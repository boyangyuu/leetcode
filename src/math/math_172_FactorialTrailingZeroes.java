package math;

public class math_172_FactorialTrailingZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    //wrong
    public int wrong_trailingZeroes(int n) {
        return n / 5;
    }

    // right
    public int trailingZeroes(int n) {
        int res = 0;
        while (n >= 5){
            res += n % 5; //todo bug 2
            n /= 5;
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

 count n % 5, because only 2*5 and 0 can generate 0, and 2 is enough, so count 5!!

 wrong solution

 n % 5

 right solution
 while (n >= 5){
    res += n % 5;
    n /= 5;
 }


 TODO case

 case1


 TODO bug

 bug1
 return n % 5; // todo case1
 =>
 ...
 case n = 25
 2,5,10,12,15,20,25
 TODO solution!!  however 25 has two 5


 bug2
 res += n % 5; //todo bug 2
 =>
 res += n / 5;

 bug3
 */

/*
TODO tutorial


 */
