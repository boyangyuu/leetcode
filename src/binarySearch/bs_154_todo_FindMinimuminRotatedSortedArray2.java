package binarySearch;

import java.util.List;
import java.util.Map;
import java.util.Set;

// todo review the solutions and the particular case
public class bs_154_todo_FindMinimuminRotatedSortedArray2 {
    public static void main(String[] args) {
        List list;Map map;Set set;

        System.out.println(findMin(new int[]{0, 4, 5, 6, 7, 0, 0}));

        //todo bug case!!!
        System.out.println(findMin(new int[]{0, 0}));
        System.out.println(findMin(new int[]{1, 2, 1, 1, 1}));
    }


    // cleanest code
    public static int findMin(int[] nums) {
        int i = 0, j = nums.length - 1, min = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            // left is sorted
            if (nums[i] < nums[mid]) {
                min = Math.min(min, nums[i]);
                i = mid + 1;
            } else if (nums[i] > nums[mid]) {
                min = Math.min(min, nums[mid]);
                j = mid - 1;
            } else {
                // todo bug
                min = Math.min(min, nums[i]);
                i++;
            }
        }
        return min;
    }


}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
类似 翻折之后的二分查找,
 如下
 if (nums[left] < nums[right]) {

 } else {
 之后每个分支做下处理即可



 TODO case

 TODO bug

 bug1


 bug2
 bug3
 */




