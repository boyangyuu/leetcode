package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class hs_204_CountPrimes {
    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        int cnt = 0;
        int[] map = new int[n]; // from 2 to n-1, def is 0|prime //todo bug1

        //generate map
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(map[i] == 0) {
                for (int j = i*i; j < n; j+=i) { //todo bug2
                    map[j] = 1;
                }

            }
        }

        //count
        for (int i = 2; i < map.length; i++) {
            if(map[i] == 0) cnt++;
        }
        return cnt;
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
  todo http://www.cnblogs.com/grandyang/p/4462810.html 观看图

 TODO solotion

 思想
 1. 非质数Xn一定可以由 1个质数(小于根号Xn)和1个其他数字相乘组成, 所以遇到质数,则将其所有可能产生的非质数 产生出来 则剩下的一定是质数
最小因子 非质例如 2*47 = 94


 {
    HashMap map : key=> index value=> boolean default is true(prime)
    Math.sqr(n) : 最小质数的范围


 }

 TODO case

 TODO bug

 bug1
 int[] map = new int[n+1];
 int[] map = new int[n];// from 2 to n-1, def is 0|prime //todo bug1 题意为小于n

 bug2

 for (int j = i; j < n; j+=i) { //todo bug2
 for (int j = i*2; j < n; j+=i) { // todo j不是from 最小质数
 for (int j = i*i; j < n; j+=i) { //todo i*i 才是两者乘积较小的 例如 3=+3  应该是 9,12,15

 bug3
 */

/*
TODO tutorial


 */
