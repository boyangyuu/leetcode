package dp;

public class d_91_DecodeWays {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        String s = "121212";
//        System.out.println(numDecodings(s));
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
 https://discuss.leetcode.com/topic/35840/java-clean-dp-solution-with-explanation
 https://discuss.leetcode.com/topic/54450/2ms-java-dp-solution

todo solution
如何迭代

 错误:
 f(n)
 10 <26 : f(n-1) + f(n-2)
 else   : f(n-1)

 正确:
 f(n) = 0;
 x[n] != 0 : f(n) +=f(n-1)
 x[n-1] != 0 && ( x[n-1],x[n] 可以组合为1个字母 )   : f(n) += f(n-2)   1 2 [3] => 1, 2, [3] 和 1, [23]

方法不够简洁!!

todo bug
 bug1
 bug2
 bug3
 */