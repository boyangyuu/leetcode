package hashTable;

import java.util.HashSet;

public class hs_202_HappyNumber {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
            if (n == 1) return true;
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
 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by
 the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it lo
 ops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 参考网站


 TODO solotion
 类似166


 {
  int n   : 每次迭代的n
  Set set : object=> case 82
  int sum : 取各个整数之和  x/10 , x%10  直到x 为0
 }


 TODO case

 TODO bug

 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
