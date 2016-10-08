package array;

public class a_209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
//        1 2 2 3 3 4
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int left = 0, right = 0, sum = nums[0], ret = Integer.MAX_VALUE; //重点1
        while(right < nums.length){
            if (sum < s) {
                if (right == nums.length - 1) break;  //bug1
                sum += nums[++right];
                continue;
            } else {
                ret = Math.min(ret, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ret == Integer.MAX_VALUE ? 0 : ret;  //重点1
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

 思路 :
left 左起点 right 右起点 ret 结果

 sum < target 则 right++;
 sum >= target 则 left左移,检测是否可以更新ret

todo!! solution 2
 step 1
 新建数组, x[i] 表示 nums[0]:nums[i] 之和

 step 2
 for 遍历
 {
    以 nums[i] 为左起点, 二分查找 x 中 第一个大于等于target的坐标 r ,  binarySearch(x, i, l -1, target)
    res = Max(r-i, res)
 }



 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */