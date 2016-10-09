package bit;

public class bit_29_DivideTwoIntegers {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int divide(int dividend, int divisor) {
        long dd = Math.abs((long)dividend), dv = Math.abs((long)divisor); // todo bug 3
        long ans = 0;
        int bit = 31;
        while (bit >= 0) {  //todo bug1 要采用这种31位开始的
            long tmp = dv << bit;
            if (dd >= tmp) {
                ans += 1l << bit; //todo bug 2
                dd -= tmp;
            }
            bit--;
        }

        int flag = (dividend ^ divisor) >> 31 == 0 ? 1 : -1; //相同为0 => 1
        ans *= flag;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) ans;
    }

    public int divide1(int dividend, int divisor) {
        long dd = Math.abs(dividend), dv = Math.abs(divisor);
        long ans = 0;
        int i = 0;
        while(dd >= dv) {
            ans += 1 << i++;
            dd -= dv;
            dv = dv << 1;
            System.out.println("ans" + ans);
        }

        int flag = (dividend ^ divisor) >> 31 == 0 ? 1 : -1;
        ans *= flag;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) ans;
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
 todo http://zhuixin8.com/2016/10/04/%E7%99%BD%E8%AF%9DLeetCode-29-Divide-Two-Integers/

 TODO solotion

 dd
 = dv * m + k
 = dv * 2^0 * i + dv * 2^1 * i + ... 2^31 * i (i为1或者0)

 必须要从高位开始
 case 5,2
 output 1
 expected 2

 TODO case

 TODO bug

 bug1
 while(dd >= dv) {
=>
 while (bit >= 0) { //todo bug1

 bug2
 ans += 1 << bit; //todo!!! bug 2
 =>
 ans += 1l << bit; //todo bug 2
 case
 -2147483648
 -1
 bit 为 31时, 1 << bit 为 -2147483648(10...9) , 而非想要的 2^31

 bug3
 long dd = Math.abs(dividend), dv = Math.abs(divisor); // todo bug 3
 =>
 long dd = Math.abs((long)dividend), dv = Math.abs((long)divisor); // todo bug 3
 case
 Math.abs(MIN) == 0 , not -2147483648, so need to convert long
 */

/*
TODO tutorial


 */
