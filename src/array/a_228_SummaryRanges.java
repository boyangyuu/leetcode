package array;

import java.util.ArrayList;
import java.util.List;

public class a_228_SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList();
        int i = 0, l = 0;
        while(true){
            if (i == nums.length - 1) {
                if (l == 0)
                    ret.add("" + nums[i]);
                else {
                    ret.add(nums[i - 1] - l + 1 + "->" + nums[i - 1]);
                }
                break;
            }

            if (nums[i] == nums[i - 1] + 1){
                l++;
                i++;
            } else {
                if (l == 0)
                    ret.add("" + nums[i-1]);
                else {
                    ret.add((nums[i - 1] - l + 1) + "->" + nums[i - 1]);
                }
                l = 0;
                i++;
            }
        }


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

 思路 :
l 前面有几个元素可以连



 a[i+1]  == a[i] + 1 :    //重点 往后看,i+1 别往前看 a[i] == a[i-1] 别这样比!!!
    如果 i+1 到头 , 直接插入 "a[i+1] -> a[i] - l"

    l++;
    i++;
 a[i+1]  != a[i] + 1 :
    如果i + 1到头
    l == 0 则 插入a[i];
    l != 0 则 插入 "a[i] -> a[i] - l"
    l 重置为0


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */