package dp;

public class d_338_CountingBits {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) dp[i] = dp[i/2];
            else dp[i] = dp[i/2] + 1;
        }
        return dp;
    }
}
/** 题
 *
 * http:
 *
 Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in
 their binary representation and return them as an array.

 todo the number of 1's stands for the appear times of "1"

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 TODO solotion

 0    0000    0
 -------------
 1    0001    1
 -------------
 2    0010    1
 3    0011    2
 -------------
 4    0100    1
 5    0101    2
 6    0110    2
 7    0111    3
 -------------
 8    1000    1
 9    1001    2
 10   1010    2
 11   1011    3
 12   1100    2
 13   1101    3
 14   1110    3
 15   1111    4
  //todo
  dp[i] = {
    dp[i/2] // i % 2 == 0 (even)
    dp[i/2] + 1 // i % 2 == 1 (odd)
 }


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */