package math;

public class math_268_ok_MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    /*
        O(n)
     */

    public int missingNumber2(int[] nums) {
        // 0..n+1 之和
        int sum = (nums.length  + 0) * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
            sum2 += nums[i];
        }
        return sum - sum2;
    }

    /*
        bit Manipulation
     */
    public int missingNumber1(int[] nums) {
        int bit = 0;
        for (int i = 0; i < nums.length; i++) {
            bit += (i + 1) ^ nums[i]; // todo!! bug 1
        }
        return bit;
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
 0 无论在 s1,s2均可以被排除, 故 i + 1

 todo s1
 求和 1.。n 与当前数组,

 todo s2
 异或, 1,。。。n 与当前数组, 相同的都被亦或掉, 剩下来的是答案


 TODO case

 TODO bug

 bug1
 bit += (i + 1) ^ nums[i]; // todo!! bug 1 不要用相加
 =>
 bit ^= (i + 1) ^ nums[i]; // todo!! 是将所有的数字, 1到n 和input数组 都亦或
 bug2
 bug3
 */

/*
TODO tutorial


 */
