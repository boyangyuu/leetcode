package math;

public class math_67_addBinary {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public String addBinary(String a, String b) {
        String res = "";
        int ia = a.length() - 1, ib = b.length() - 1, carry = 0;
        while (ia >= 0 || ib >= 0) { // todo bug 1
            int va = ia >= 0 ? a.charAt(ia--) - '0' : 0;
            int vb = ib >= 0 ? b.charAt(ib--) - '0' : 0;
            res += (va + vb + carry) % 2; // todo bug 2
            carry = (va + vb + carry) / 2;
        }
        if (carry == 1) return "1" + res;
        else return res;
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

 step 1
 从末尾相加 除以2,  判断是否进位 余数为cur, 商为进位


 TODO case

 TODO bug

 bug1

 while (--ia >= 0 || --ib >= 0) { // todo bug 1
 =>
 while (ia >= 0 || ib >= 0) { // todo bug 1
 --b可能不执行 !!

 bug2
 res += (va + vb + carry) % 2; // todo bug 2
 =>
 res = (va + vb + carry) % 2 + res; // todo bug 2

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
