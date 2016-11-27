package array;
import java.util.*;
public class a_118_ok_PascalsTriangle {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            List<Integer> l = new ArrayList();
            for (int j = 0; j < i + 1; j++) {
                int v = 1;
                if (j != 0 && j != i) {
                    List<Integer> lastL = ret.get(i - 1);
                    v = lastL.get(j - 1) + lastL.get(j);
                }
                l.add(v);
            }
            ret.add(l);
        }
        return ret;
    }
}
/** 题
 *
 * http:
 *
 Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]

 杨辉三角是二项式系数的一种写法，如果熟悉杨辉三角的五个性质，那么很好生成，可参见我的上一篇博文：

 http://www.cnblogs.com/grandyang/p/4031536.html



 具体生成算是：每一行的首个和结尾一个数字都是1，从第三行开始，中间的每个数字都是上一行的左右两个数字之和。代码如下：

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

todo solution
 具体生成算是：每一行的首个和结尾一个数字都是1，从第三行开始，中间的每个数字都是上一行的左右两个数字之和。代码如下：

todo bug
 bug1
 bug2
 bug3
 */