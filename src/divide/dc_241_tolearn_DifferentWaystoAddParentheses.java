package divide;

import tutorials.ListNode;

import java.util.ArrayList;
import java.util.List;

// todo 学习 分治法 相关 题目,
// todo 学习dc 和 dp 区别(dc 常用递归, dc 子问题之间没有联系, dc不需要记录子问题解)
public class dc_241_tolearn_DifferentWaystoAddParentheses {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(diffWaysToCompute("2*3-4*5"));
    }


    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        if (!input.contains("*") && !input.contains("+") && !input.contains("-")){
            res.add(Integer.parseInt(input));
            return res;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '*' && c != '+' && c != '-') continue;
            List<Integer> l = diffWaysToCompute(input.substring(0, i));
            List<Integer> r = diffWaysToCompute(input.substring(i + 1, input.length()));
            for (int li : l){
                for (int ri : r) {
                    if (c == '*') res.add(li * ri);
                    else if (c == '+') res.add(li + ri);
                    else if (c == '-') res.add(li - ri);
                }
            }
        }
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

 TODO solotion
 ######s1######
 --performance
 父问题 解集 =
 f (左侧子问题 解集 ,右侧子问题解集)

 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######

 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*



 */
