package array;

public class a_396_rotateFunction {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int maxRotateFunction(int[] A) {
        int t = 0, sum = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            sum += A[i];
            t += i * A[i];
        }
        int res = t;
        for (int i = 1; i < n; ++i) {
            t = t + sum - n * A[n - i];
            res = Math.max(res, t);
        }
        return res;
    }

    public int maxRotateFunction1(int[] A) {
        if (A.length == 0) return 0;
        int l = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            int tmp = 0;
            for (int j = 0; j < l; j++) {
                tmp += (i + j) % l * A[j]; // todo bug 1
            }
            max = Math.max(max, tmp);
        }
        return max;
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
 *
 todo solutuon 1
 求出所有组合
 tmp += A[j] * (i + j) % l; // todo bug 1
 exceed time!!

 todo bug
 tmp += A[j] * (i + j) % l; // todo bug 1
 =>
 tmp += (i + j) % l * A[j]; // todo bug 1 运算符先后问题

 todo solution 2

 F(0) = 0A + 1B + 2C +3D

 F(1) = 0D + 1A + 2B +3C

 F(2) = 0C + 1D + 2A +3B

 F(3) = 0B + 1C + 2D +3A

 那么，我们通过仔细观察，我们可以得出下面的规律：

 F(1) = F(0) + sum - 4D

 F(2) = F(1) + sum - 4C

 F(3) = F(2) + sum - 4B

 那么我们就找到规律了, F(i) = F(i-1) + sum - n*A[n-i]，可以写出代码如下：

 参考网站

 思路 :


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */