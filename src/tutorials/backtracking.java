package tutorials;

import java.util.*;

public class backtracking {
    public static void mains(String[] args) {
        int n = 5;
        int k = 3;
        //放弃!
        List<ArrayList<Integer>> ret = new ArrayList();
        List<Integer> curr = new ArrayList();
        DFS(ret, curr, n, k, 1);
        System.out.println("result:" + ret);
    }

    public static void DFS(List<ArrayList<Integer>> ret, List<Integer> curr, int n, int k, int level){
        for (int i = level; i <= n; i++) {
            curr.add(i);
            double a = 3.0;
            int b = (int)a;

        }


    }


}
/** 题
 Combinations：Given two integers n and k,return all possible combinations of k numbersout of 1 ... n. For example,
 If n = 4 and k =2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 （做一个白话版的描述，给你两个整数 n和k，从1-n中选择k个数字的组合。比如n=4，那么从1,2,3,4中选取两个数字的组合，包括图上所述的四种。）
 然后我们看看题目给出的框架：
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站 http://www.nowcoder.com/discuss/529?type=1&order=1&pos=521&page=0

 思路 :
 回溯法解题时通常包含3个步骤：
 1. 针对所给问题，定义问题的解空间；

 2. 确定易于搜索的解空间结构；

 3. 以深度优先方式搜索解空间，并在搜索过程中用剪枝函数避免无效搜索。

 步骤1
 产生递归解空间
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */