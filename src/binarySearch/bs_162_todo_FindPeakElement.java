package binarySearch;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class bs_162_todo_FindPeakElement {


    // todo 本题强记就好!!    , 要好好利用 -1,n 处-无穷这个特点
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(findPeakElement1(new int[]{1, 2, 3, 1}));
    }

    // recommended 出错, 必须 搞出mid+1 , 否则死循环, 例如 (i==0+j==1)/2 = 0, i = mid, 一直循环下去
    public static int findPeakElement2(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            //if () return mid;
        }
        return i;
    }

    // recommended
    public static int findPeakElement1(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {   // todo 留出 i == j 作为答案
            int mid = (i + j) / 2;
            if (nums[mid] < nums[mid + 1]) i = mid + 1;
            else j = mid;
        }
        return i;
    }

    // 没看明白( 同样推荐, 但不是logn!!)
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                if (i == nums.length - 1 || nums[i] < nums[i + 1])
                    return i;
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
 //todo Given an input array where num[i] ≠ num[i+1],
 注意 num[i] ≠ num[i+1],

 TODO solotion
 二分查找
   if nums[mid] > nums[mid + 1] : r = mid;
 // 由于 左边界为最小值, nums[-1] < nums[mid]  > nums[mid + 1] 则 todo 左侧一定有peak (右侧也可能有)

 当i,j 互相收缩 则peak 一定在里面

  else
 nums[mid] < nums[mid + 1] : l = mid + 1
 // 同上


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




