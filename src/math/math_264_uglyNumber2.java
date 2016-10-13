package math;

public class math_264_uglyNumber2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


    public int nthUglyNumber(int num) {
        int[] dp = new int[num];
        int i2 = 0, i3 = 0, i5 = 0, i = 1;
        dp[0] = 1;
        while (i < num) {
            int v2 = dp[i2] * 2, v3 = dp[i3] * 3, v5 = dp[i5] * 5;
            int vmin = Math.min(v2, Math.min(v3, v5));
            if (vmin == v2) i2++;
            if (vmin == v3) i3++;
            if (vmin == v5) i5++;
            dp[i++] = vmin;
        }

        return dp[num - 1];
    }

    public int nthUglyNumber2(int num) {
        int[] dp = new int[num];
        dp[0] = 1;
        for (int i = 1; i < num; i++) {
            int v2 = 1, v3 = 1, v5 = 1, k = 0;
            while (v2 <= dp[i - 1]) v2 = dp[k++] * 2;

            k = 0;
            while (v3 <= dp[i - 1]) v3 = dp[k++] * 3;

            k = 0;
            while (v5 <= dp[i - 1]) v5 = dp[k++] * 5;

            dp[i] = Math.max(v5, Math.min(v2, v3));
        }

        return dp[num - 1];
    }

}
/** 题
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
 todo solution 1 (TLE)
 check the n[i] whether unly or not , until count n ugly num

 todo solution 2 (accept)
 unly num is mutiplied by 2,3,5 from a smaller unly number

 f(i) = Min {
    2 * f(?)
    3 * f(?)
    5 * f(?)
 }


 todo solution 3 (folow up better! )
 int i2,i3,i5 = 0 //
 分别尝试做 dp[i]

 丑陋数序列可以拆分为下面3个子列表：
  子列表可能存在重复
  1,2,3,4,5,6,8,9,10,12
 (1) 1×2, 2×2, 3×2, 4×2, 5×2, …  // dp[0] * 2 , dp[1] * 2, dp[2] * 2, dp[3] * 2...
 (2) 1×3, 2×3, 3×3, 4×3, 5×3, … //
 (3) 1×5, 2×5, 3×5, 4×5, 5×5, … //

 我们可以发现每个列表都是一个丑陋数分别乘以2,3,5，而要求的丑陋数就是从已经生成的序列中取出来的，
dp[i] 一定存在于 这三个列表的下一个ugly数字,



 TODO case

 TODO bug

TODO tutorial


 */
