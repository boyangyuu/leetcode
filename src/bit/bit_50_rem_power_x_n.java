package bit;


// todo 建议强记思路和解法
// todo stack over 的时候 不用管它 用help 就不会出现, 很奇怪的问题 不比在意
public class bit_50_rem_power_x_n {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        System.out.println(myPow1(3.0, -2));
        System.out.println(myPow1(3.0, 10));
    }

    public static double myPow1(double x, int n) {
        if (n < 0) return 1 / myPow1(x, -n);
        if (n == 0) return 1;
        if (n == 1) return x;
        double t = myPow1(x, n / 2);
        if (n % 2 == 0) return t * t;
        else return t * t * x;
    }



    public static double myPow(double x, int n) {
        if (n < 0) return 1 / help3(x, -n); // todo bug 2
        else return help3(x, n);
    }

    public static double help3(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double v = help3(x, n / 2);
        if (n % 2 == 0) return v * v;
        else return v * v * x;
    }

    // solution 1 TLE
    public double help1(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        else if (n % 2 == 0) return help1 (x, n / 2) * help1 (x, n / 2) ;
        else return help1(x, n / 2) * help1(x, n / 2 + 1);  //todo bug 1
    }

    // solution 2
    public double help(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double v = help (x, n / 2);
        if (n % 2 == 0) return v * v;
        else return v * help(x, n / 2 + 1);
    }

    // solution best
    public double help2(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double v = help2 (x, n / 2);
        if (n % 2 == 0) return v * v;
        else return v * v * x;  //todo better
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
todo translation 本题n为整数

 TODO case

 TODO bug

 bug1

 else return help1(x, n / 2) * help1(x, n / 2 + 1);  //todo bug 1
 =>
 if (n == 1) return x;
 else return help1(x, n / 2) * help1(x, n / 2 + 1);  //todo bug 1
 case 1
 1 = 0 * 1 = 0 * 1 无限循环

 todo follow
 s1
 for 循环 TLE
 s2
 没有保存 value TLE
 s3
 else return v * v * x;  //todo better



 bug2
 bug3


 */


