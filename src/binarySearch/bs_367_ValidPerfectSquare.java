package binarySearch;


public class bs_367_ValidPerfectSquare {
    public static void main(String[] args) {


    }

    public boolean isPerfectSquare(int num) {
        long i = 0, j = num / 2 + 1;
        while (i <= j) {
            long m = (j - i) / 2 + i;
            long target = num;
            if (target == m * m) return true;
            else if (target > m * m) i = m + 1;
            else j = m - 1;
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
 int v = m * m; // 越界 之后成为负值!!!
 =>
 long v = m * m; // todo bug 1

 int i = 0, j = num / 2 + 1; // int 与int的运算 均为int 所以用long!
 =>
 long i = 0, j = num / 2 + 1; // todo bug 2



 ######s2######

 TODO case
 case 1
 the m * m is byound the int_max!! // todo case 1


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
