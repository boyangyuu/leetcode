package bit;

public class bit_0_tutorial {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
//        System.out.println("1");
        int test = 3 & 1 << 1; // 10 & 10
        System.out.println(test);

        System.out.println("111 & 010 : " + (7 & 2));

        // check if it is zero in i index bit , 检查某一位是否是0

        System.out.println("1111, 4位是否是 zero 1111 & 0..00100: " + (15 & (1 << 2)));

        // todo  求 某数字的 32位 bit
        String res1 = "";
        int resI1 = 0;
        int target = 1231233121;
        for (int i = 0; i < 32; i++) {
            target = target >> i;
            res1 += target & 1;
        }
        System.out.println(res1);


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
 取反 ~  : ~101 = 010

 todo 最大最小
 Math.Max_VALUE  2power32 - 1; Math.MIN_VALUE  -2power32

 todo 正负
 1. 整数的最高位为 符号位, 0为正,1为负
 2. 判断乘积正负  m ^ n << 32 , 1 为相同(正)
 3. 正数转负数  +5 0101 -5 1011, 求反+1

 todo int => bit
 String s = Integer.toBinaryString(n);
 -1 : 100..01 (32bit)


 todo & , |
  & 会变小, 通常是检验用 1010101 & 1 << 3 => 检查第3位 , 0:第三位为0
  |= , 累加, 如 1 |= 10 |= 100 => 111

 */


