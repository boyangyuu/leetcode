package array;

import java.util.Arrays;

// 12/19 6:10 -- 6.48 failed
// todo 1 思路没有 没有注意到 该数组的一个特性, 需要再次思考
// todo 2 bug
public class a_41_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ret = firstMissingPositive(nums);
        System.out.println(ret);

        // todo bug!! case duplicate elements
        System.out.println(firstMissingPositive(new int[]{7,5,3,5,6,6,6,6,6,4,1})); // except 2 , output wrong

    }

//    public static int firstMissingPositive(int[] nums) {
//
//    }


    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if (nums[i] == i + 1 || nums[i] > nums.length || nums[i] <= 0){
                i++;
            } else if (nums[i] != nums[nums[i] - 1] ) { //bug1
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        System.out.println("nums" + Arrays.toString(nums));
        i = 0;
        while(i < nums.length && nums[i] == i + 1) i++;
        return i + 1;

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
/** 题
 *
 * http:https://leetcode.com/problems/first-missing-positive/
 *
 Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 延伸:
 此题可先延伸为一个小问题 将数组排序, 数组里面的数字小于length,大于0(或者其他类似约束) 其实这种题思考点在于如何借助现有空间!
 如 {2,3,4,2,5} n 为5 O(1)排序

 i=0 : 2 与 a[2-1] = 3 置换 #3,2,#4,2,1 (2 不在其位)
 i=0 : 3 与 a[3-1] = 4 置换 #4,2,3,#2,1 (3 不在其位)
 i=0 : 4 与 a[4-1] = 2 置换 #2,#2,3,4,1 (4 不在其位)
 i=0 : 2 与 a[2-1] = 2 不动           (2 与占位者重复)  ==>    无需关心, 本题只需要排列 前面的1-n即可 其他的无所谓

 i=1 : 2 ... (在其位)




todo solution
想法化解, 此类O(1) 问题, 都是判断元素,之后想法忽略掉此元素, 刚开始我想的是取两个值, 左右极限之后 缩小范围, gg
 通常处理方法为 遍历过程中 ①维护1-2个值 ②改变原有数组 此题为改变原有数组

 先将问题化解为 如何将有效值排序, 个数为n,当数字 a[i] > n 或者 a[i] <= 0 即可忽略



 bug1
  重复的 可以i++过去 这道题不需要严格地排序, 只需要形成 1,2,3,4即可
 bug2
 bug3
 */