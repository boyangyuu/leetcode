package $;

import temp.NestedInteger;

import java.util.List;

// todo step1、 find the depth;   step2、 dfs
public class dfs_$364_review_NestedListWeightSum2 {

    public static void main(String[] args) {


    }

    public int depthSumInverse(List<NestedInteger> nestedList) {
        int depth = getDepth(nestedList);
        return help(nestedList, depth);
    }

    public int getDepth(List<NestedInteger> list) {
        int res = 0;
        for (NestedInteger ni : list) {
            if (ni.isInteger()) res = Math.max(res, 1);
            else res = Math.max(res, 1 + getDepth(ni.getList()));
        }
        return res;
    }

    public int help(List<NestedInteger> nestedList, int deep) {
        int sum = 0;
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) sum += ni.getInteger() * deep;
            else {
                sum += help(ni.getList(), deep - 1);
            }
        }
        return sum;
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
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
