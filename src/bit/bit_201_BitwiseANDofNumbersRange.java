package bit;


// todo just remember that
public class bit_201_BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};

    }

    /*
    m = |101| ,n = |111|
    the result is the common prefix of m and n
    case
    1 0 1
    1 1 0   => 1 . .  => 100
    1 1 1

    */
    public int rangeBitwiseAnd(int m, int n) {
        int m1 = m, n1 = n;
        int cnt = 0; // cnt of <<
        while(m1 != n1) {
            m1 = m1 >> 1;
            n1 = n1 >> 1;
            cnt++;
        }
        return m1 << cnt;
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
