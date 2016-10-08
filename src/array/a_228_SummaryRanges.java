package array;

import java.util.ArrayList;
import java.util.List;

public class a_228_SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;
        String tmps = "" + nums[0];
        String tmps1 = "";
        for (int i = 0; i < nums.length - 1; i++) { // todo bug 1
            if (nums[i + 1] == nums[i] + 1)
                tmps1 = "->" + nums[i + 1];
            else {
                res.add(tmps + tmps1);
                tmps = "" + nums[i + 1];
                tmps1 = "";
            }
        }
        res.add(tmps + tmps1);
        return res;
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
 todo solution 1
 Given a sorted integer array without duplicates, return the summary of its ranges.

 For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

 数据结构
 int cur // from 0 to n - 2
 String tmps = ""; // start with "" + nums[0]
 String tmps1 = ""; // ->xxxx //todo tips 设两个str 拼接
 思路
 for (1 : n -1)
 if nums[cur + 1] == nums[cur] + 1
    tmps1 = "->nums[cur + 1]"
 else
    res.add (tmps + tmps2)
    tmps = "nums[cur+1]"
    tmps1 = ""

 add the last element res.add(tmps + tmps1)


 todo bug
 for (int i = 1; i < nums.length - 1; i++) { // todo bug 1
 =>
 for (int i = 0; i < nums.length - 1; i++) { // todo bug 1

 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */