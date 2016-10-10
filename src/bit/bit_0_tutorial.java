package bit;

public class bit_0_tutorial {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


}


/** Solution

TODO tutorial

 todo #运算符
 异或 1 ^ 0 = 1　　假^真=真　　假^假=假　　真^真=假 (相同即为0 不同为1)
 与   1 & 1 = 1                                 (只有1&1 才为1)
 非   0 | 0 = 0 , 0 | 1 = 1, 1 | 0 = 1, 1 | 1 = 1 (只有0|0 才为0)
 >>i  右移i位          //1101 >> 2 = 11
 x>>i & 1 取 x的第i+1位的值(1 or 0) // 箭头方向为移动方向

 todo 最大最小
 Math.Max_VALUE  2power32 - 1; Math.MIN_VALUE  -2power32

 todo 正负
 1. 整数的最高位为 符号位, 0为正,1为负
 2. 判断乘积正负  m ^ n << 32 , 1 为相同(正)
 3. 正数转负数  +5 0101 -5 1011, 求反+1








 */


