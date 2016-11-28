package array;

public class a_88_todo_MergeSortedArray {

    // todo bugfree 复习下思路即可
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }




    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1; // todo 思路
        while(k >= 0){
            if (i == -1)
                nums1[k] = nums2[j--];
            else if (j == -1)
                nums1[k] = nums2[i--];
            else if (nums1[i] < nums2[j])
                nums1[k] = nums2[j--];
            else
                nums1[k] = nums1[i--];
            k--;
        }
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


todo bug
 bug1
 bug2
 bug3
 */