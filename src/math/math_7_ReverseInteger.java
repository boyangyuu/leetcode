package math;

public class math_7_ReverseInteger {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int reverse(int x) {
        long res = 0;  // todo bug 1
        while (x != 0) {
            int xa = x % 10;
            x /= 10;
            res = res * 10 + xa;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0; // todo bug2
        else return (int) res; //todo bug 3
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


 TODO case

 TODO bug

 bug1

 int res = 0;  // todo bug 1
 =>
 long res = 0;  // todo bug 1

 bug2
 //
 =>
 if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0; // todo bug2


 bug3

 else return (int) res; //todo bug 2
 =>
 else return  res; //todo bug 2 error ,

 */

/*
TODO tutorial


 */
