package math;

public class math_313_SuperUglyNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] pIndexs = new int[primes.length];
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i != 0) dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < pIndexs.length; j++) {
                int v = dp[pIndexs[j]] * primes[j];
                dp[i] = Math.min(dp[i], v);
            }

            for (int j = 0; j < pIndexs.length; j++) {
                int v = dp[pIndexs[j]] * primes[j];
                if (dp[i] == v) pIndexs[j]++;
            }
        }

        return dp[n];


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
 类似uglyNumber2

 todo s1
 structure:
 int[] dp = new int[n+1];
 int dp[i] // the ith super ugly based on primes

 dp[i] = min and > dp[i-1] {  // the min one >= dp[i-1]
    primes[0] * dp[?],
    primes[1] * dp[?],
    ..
 }

 return dp[n]

 todo s2


参考uglyNumber2

 (1) 1×primes[0], 2×primes[0], 3×primes[0], 4×primes[0], 5×primes[0], … // 长度为n (1,2,3,4,5 不是真实的)
 (2) 1×primes[1], 2×primes[1], 3×primes[1], 4×primes[1], 5×primes[1], …
 (3) ..
  ..
 (primes.length)

 structure:
 int [] pIndexs  // primes index
 存各个prime index


 dp[i] = {


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
