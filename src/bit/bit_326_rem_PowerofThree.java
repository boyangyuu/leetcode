package bit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// todo 以后学习 power of 2


public class bit_326_rem_PowerofThree {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(124));
    }

    static boolean isPowerOfThree(int n) {
        while (n > 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }


    /*
    题目中的Follow up让我们不用循环，那么有一个投机取巧的方法，由于输入是int，正数范围是0-231，在此范围中允许的最大的3的次方数为319=1162261467
    ，那么我们只要看这个数能否被n整除即可，参见代码如下：

     */
    static boolean isPowerOfThree1(int n) {
        return (n > 0 && 1162261467 % n == 0);
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
 // solution 1
 事先知道 2^31 中, 最大的 power 3 是

 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######

 http://www.cnblogs.com/grandyang/p/4623394.html
 bit 方法
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
