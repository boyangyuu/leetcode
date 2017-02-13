package math;

// todo 用最简化的solution 10:42 --
public class math_7_review_ReverseInteger {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(-4%10);

        // consider case
        System.out.println(reverse1(1000));
        System.out.println(reverse1(-1234));

        // easy to fail case
        System.out.println(reverse1(Integer.MAX_VALUE));
        System.out.println(reverse1(Integer.MIN_VALUE));
    }



    public static int reverse1(int x) {
        long res = 0;
        while (x != 0) {
            int xa = x % 10;
            x /= 10;
            res = res * 10 + xa;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        else return (int) res;
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
