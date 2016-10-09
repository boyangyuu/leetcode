package array;

public class a_283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length) {
            if (nums[j] == 0)
                j++;
            else
                nums[i++] = nums[j++];
        }

        while (i < nums.length) nums[i++] = 0;
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

todo solution
 tips
 本题要求操作次数最少!
 so 不要用交换， 交换每个数可能需要2次操作次数 加2个指针遍历次数

 优化方法
 两个指针， nums[i] = nums[j] , i指向被重置位置， j 一直往后寻找非0的数字

 直到j 到结尾时， 其他nums 元素均设置为0即可。

todo bug
 bug1
 bug2
 bug3
 */