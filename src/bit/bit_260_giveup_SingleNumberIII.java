package bit;


// todo just remember that
public class bit_260_giveup_SingleNumberIII {
    /*

    首先计算nums数组中所有数字的异或，记为xor

    令lowbit = xor & -xor，lowbit的含义为xor从低位向高位，第一个非0位所对应的数字

    例如假设xor = 6（二进制：0110），则-xor为（二进制：1010，-6的补码，two's complement）

    则lowbit = 2（二进制：0010）

    根据异或运算的性质，“同0异1”

    记只出现一次的两个数字分别为a与b

    可知a & lowbit与b & lowbit的结果一定不同

    通过这种方式，即可将a与b拆分开来

     */
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int n = 0;
        for (int num : nums) n ^= num;

        n &= -n;


        for (int num : nums) {
            if ((n & num) == 0) res[0] ^= num;
            else res[1] ^= num;
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



