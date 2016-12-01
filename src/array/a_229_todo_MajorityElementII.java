package array;

import java.util.*;

// todo code again (思路 和 m1,m2 的初始化 需要改善 且有bug)
public class a_229_todo_MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        // todo bug case 小心 两个候选者 置成同一个

        System.out.println(majorityElement1(new int[]{2,2,2,1,1,1}));
    }


    public static List<Integer> majorityElement1(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int m1 = 0, m2 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == m1 || c1 == 0 && nums[i] != m2) { // todo bug  added : && nums[i] != m2
                m1 = nums[i];
                c1++;
            } else if (nums[i] == m2 || c2 == 0) {
                m2 = nums[i];
                c2++;
            } else {
                c1--;
                c2--;
            }
            // System.out.println("m1: " + m1 + " c1: " + c1 + ", m2: " + m2 + " c2: " + c2);
        }
        c1 = 0; c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == m1) c1++;
            else if (nums[i] == m2) c2++;
        }
        if (c1 > nums.length / 3) res.add(m1);
        if (c2 > nums.length / 3) res.add(m2);
        return res;
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