package math;


// todo 复习思路,  要求 time:  log n 比如 对于5! , 为log5
// 12/13 11:45 -- 12:00
public class math_172_FactorialTrailingZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(trailingZeroes1(1));
    }

    public static int trailingZeroes1(int n) {
        int res = 0;
        while (n != 0) {
            res += n / 5; // 100 : round1(5) : 5,10,15..95,100 totally 20 round2(25) : 25,50,75,100 totally 1
            n /= 5;
        }
        return res;
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

 todo count n % 5, because only 2*5 and 0 can generate 0, and 2 is enough, so just need to count 5!!

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
