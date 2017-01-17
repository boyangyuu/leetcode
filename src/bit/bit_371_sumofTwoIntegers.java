package bit;



public class bit_371_sumofTwoIntegers {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        // todo learn 4 >> 1 为 2 (无论左移右移 位数是不会变的)
        System.out.println(4 >> 1);
        System.out.println(Math.random() * 300);
        System.out.println(Math.random() * 300);
        System.out.println(Math.random() * 300);
    }


/*

将所有需要进位的(XOR 为1) , 构成b, 并进1位
将所有不需要进位的 构成a
知道 b为0
    1010101
    0101110

    find the same bit pos, 100
    and the differnet bit pos 1010001
    add (100 <<1 , 1010001
*/

    int getSum(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }


    /*
    just add bit by bit

    1010101
    0101110

    => 1 => 11=> 011, 1=> 0011, 1=>

    */
    public int getSum1(int a, int b) {
        int res = 0, carry = 0;
        for (int i = 0; i < 32; i++) {
            int check = 1 << i;
            int cur = ((a & check) == 0 ? 0 : 1) + ((b & check) == 0 ? 0 : 1) + carry;

            if (cur == 1 || cur == 3) {
                res |= check;
            }

            carry = cur >= 2 ? 1 : 0;
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
