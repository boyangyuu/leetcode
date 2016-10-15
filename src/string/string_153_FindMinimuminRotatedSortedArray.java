package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_153_FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left - right) / 2 + right;
            if (nums[left] < nums[right]) {
                 return nums[left];
            } else {
                if (nums[mid] > nums[left]) left = mid + 1;
                else if (nums[mid] < nums[left]) right = mid; //todo bug2
                else return nums[mid]; // todo bug 1
            }
        }
        return -1;
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




