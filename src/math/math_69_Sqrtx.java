package math;

public class math_69_Sqrtx {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

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
