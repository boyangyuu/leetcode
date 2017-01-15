package array;

public class a_169_ok_MajorityElement {
    public static void mains(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int majorityElement(int[] nums) {
        int n = nums[0], c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) n = nums[i];
            if (n == nums[i]) c++;
            else c--;
        }
        return n;
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
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 O(n) time O(1) space

todo solution
 如何消除掉元素, 取a[0], a[1]
既然大于一半, a[0], a[1] 不一样 则可以抵消, 但是假如a[0], a[1] 一样, 怎么办??
 本来想 保存 a[0],a[i] 但是会有可能空间过大, 此时. a[0],a[1]既然一样, 为什么不计数 , 这样空间仅为2 !!!????

 一样的时候 count++;
 不一样的时候 count--;

 同理 大于三分之一也一样!
 三个都不一样的时候删,
 否则 则count1++ 或者count2++

todo bug
 bug1
 bug2
 bug3
 */