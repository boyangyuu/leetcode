package bit;



public class bit_342_PowerofFour {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        // todo learn 4 >> 1 为 2 (无论左移右移 位数是不会变的)
        System.out.println(4 >> 1);
    }


    /*
        idea : bit
        4: 100, 16: 10000, 64: 1000000,
        so the rule is single 1 ends with double of 0s

    */
    public boolean isPowerOfFour(int num) {
        while (num > 0) {
            if (num == 1) return true;
            if ((num & 1) == 0 && (num & 2) == 0) num = num >> 2;
            else break;
        }
        return false;
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
