package math;

public class math_9_code_PalindromeNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        //case
        System.out.println(isPalindrome1(121));
        System.out.println(isPalindrome1(1221));
        System.out.println(isPalindrome1(12231));

        //corner case
        System.out.println(isPalindrome1(0));
        System.out.println(isPalindrome1(-1));

        // todo bug case
        System.out.println(isPalindrome1(1001));
        System.out.println(isPalindrome1(10));

        // todo best solution : 1221 => 22 => null , 将原数组逐渐化简
    }


    /**
     * solution iterately check the head and tail element then remove,
     * take care of / and %, case 199 % 100 == 99 not 9; 199/100 == 1
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x) {
        if (x < 0) return false;
        int d = 1;
        while (x / d >= 10) d *= 10; // x: 12321, d : 10000,

        while (x > 0) {
            if (x / d != x % 10) return false;
            x = (x % d) / 10;
            d = d / 100;
        }

        return true;
    }

    // bad and bugs
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int d = 1;
        while (x / d >= 10) d *= 10;

        int c = 10;
        while(d >= c) {
            if (x / d != x % c) return false;
            d /= 10;
            c *= 10;
        }
        return true;
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


 TODO solotion


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial


 */
