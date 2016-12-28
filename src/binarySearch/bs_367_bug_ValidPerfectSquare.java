package binarySearch;


public class bs_367_bug_ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));

        System.out.println(isPerfectSquare(3));
        System.out.println(isPerfectSquare(4));

        // todo bug case 1 = 1 * 1 , 也算符合题意的, do not mixed up with the prime number
        System.out.println(isPerfectSquare(1));
    }

    public static boolean isPerfectSquare(int num) {
        long l = 1, r = num / 2 + 1;
        while (l <= r) {
            long m = (l + r) / 2;
            if (m * m == num) return true;
            else if (m * m < num) l = m + 1;
            else r = m - 1;
        }

        return false;
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
 ######s1######


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
