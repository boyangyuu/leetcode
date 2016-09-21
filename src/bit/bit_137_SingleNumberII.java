package bit;

public class bit_137_SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    int singleNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += (nums[j]<<i) & 1;
            }
            ret |= sum; // += 也可以
        }
        return ret;
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

用32位数字 求每个数字nums[j] 第 i 位 上出现1的次数, %3 即为目标数 i 位的值



 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial
 异或 1 ^ 0 = 1　　假^真=真　　假^假=假　　真^真=假
 与   1 & 1 = 1
 >>i  右移i位  x>>i & 1 取 x的第i+1位的值(1 or 0)

 */
