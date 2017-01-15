package $;

import temp.NestedInteger;

import java.util.LinkedList;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
// todo dfs
public class dfs_$339_review_NestedListWeightSum {

    public static void main(String[] args) {
        LinkedList<Double> queue = new LinkedList<>();
        queue.push(1.0);queue.push(2.0);
        System.out.println(queue.pollLast());

    }

    public int depthSum(List<NestedInteger> nestedList) {

        return help(nestedList, 1);
    }

    int size = 0;


    public static int help(List<NestedInteger> nestedList, int deep) {

        int sum = 0;
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) sum += ni.getInteger();
            else {
                sum += help(ni.getList(), deep + 1);
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
