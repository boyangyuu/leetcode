package array;

import java.util.*;

public class a_229_MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ret = new ArrayList();
        //ret.contains()
        int m = 0, n = 0, cm = 0, cn = 0, i = 0;
        while(i < nums.length) {
            if (nums[i] == m) {
                cm++;
            } else if (nums[i] == n) {
                cn++;
            } else if (cm == 0) {
                m = nums[i];
                cm = 1;
            } else if (cn == 0) {
                n = nums[i];
                cn = 1;
            } else {
                cm--;
                cn--;
            }
            i++;
        }

        cm = cn = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == m) cm++;
            else if (nums[j] == n) cn++;
        }

        if (cm > nums.length / 3) ret.add(m);
        if (cn > nums.length / 3) ret.add(n);
        return ret;
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
 需要两遍遍历，第一遍历找出两个候选众数，
 第二遍遍历重新投票验证这两个候选众数是否为众数即可，选候选众数方法和前面那篇Majority Element 求众数一样

todo bug
 bug1
 bug2
 bug3
 */