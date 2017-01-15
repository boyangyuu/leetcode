package bit;


import com.sun.tools.javac.util.Bits;

// todo code  << 操作符 优先级极低
public class bit_190_ReverseBits {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(reverseBits1(43261596));

        System.out.println( (0 << 2) + 1);
    }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int curb = n & (1 << i); // get right side bit
            res = curb == 0 ? (res << 1) : ((res << 1) + 1); // todo! move to left
        }
        return res;
    }

    public static int reverseBits1(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1;
            if ((n & 1) != 0) res ++;
            n = n >> 1;
        }
        return res;

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


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial
 异或 1 ^ 0 = 1　　假^真=真　　假^假=假　　真^真=假 (相同即为0 不同为1)
 与   1 & 1 = 1                                 (只有1&1 才为1)
 非   0 | 0 = 0 , 0 | 1 = 1, 1 | 0 = 1, 1 | 1 = 1 (只有0|0 才为0)
 >>i  右移i位          //1101 >> 2 = 11
 x>>i & 1 取 x的第i+1位的值(1 or 0) // 箭头方向为移动方向
 */
