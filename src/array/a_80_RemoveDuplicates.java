package array;

public class a_80_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
    }


    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int limit = 1, index = 1,index2 = 1, preNum = nums[0], length = 1;

        while (index < nums.length){
            if (nums[index] == preNum) {
                limit++;
            } else {
                preNum = nums[index];
                limit = 1;
            }

            if (limit <= 2) {
                nums[index2] = preNum;
                index2++;
                length++;
            }
            index++;
        }
        return length;

    }

}
/** 题
 *
 * http:https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 *

 Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

 For example,
 Given sorted array nums = [1,1,1,2,2,3],

 Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */

/** Solution
 * 时间  空间
 *
 *
 *k
 参考网站

 思路 :
#######本道题 debug很多次 建议熟悉思路 不要用cnt方法数数!

两个指针, i = 0, j = 1, j 试图去复制到 i的下一个位置
 当 i == 0 直接复制
当 [i] [i-1] 相同时, 则需要判断[j] , [i] == [j] 则 j++ 否则 可以复制到 i+1 且 i++ j++
 当[i] [i-1] 不同时, 则可以复制

 延伸可以单独写方法去判断 i-1,i-2,i ....


 开始 1 2 2 2 3 i = 0, j = 1,  i == 0  复制
 1 2 2 2 3 i = 1, j = 2, 复制
 1 2 2 2 3 i = 2, j = 3, 2 == 2 无法复制
 1 2 2 3 3 i = 2, j = 4, 2 != 3 复制

1 1 1 i = 0 j = 0 c = 1
 1 1 1 i = 1 j = 1 c = 2
 1 1 1 i = 1 j = 2 c = 2



 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */