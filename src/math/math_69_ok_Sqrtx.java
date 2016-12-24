package math;

// 12/24 11:12 - 25 13m
public class math_69_ok_Sqrtx {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

    }

    // s2 easy to understand
    public static int mySqrt1(int x) {
        long left = 0, right = x;
        while (left <= right) {
            long mid = (left + right) / 2;
            long sqrt = mid * mid;
            long sqrt1 = (mid + 1) * (mid + 1);
            if (sqrt <= x && x < sqrt1) return (int) mid;
            else if (sqrt > x) right = mid - 1;
            else left = mid + 1;
        }
        return (int) right;
    }

    // binary advanced search
    public int mySqrt(int x) {
        long left = 0, right = x; // todo bug 1
        while (left <= right) {
            long mid = (left + right) / 2;
            long sqrt = mid * mid;
            if (sqrt == x) return (int) mid;
            else if (sqrt < x) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
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
 int left, right // todo! bug 1
 =>
 long left, right // todo bug 1

 case
 left = 2, right = int_max
 left * right will be wrong , exceed the integer bound


 bug2
 bug3
 */

/*
TODO tutorial


 */
