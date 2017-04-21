package graph;

import linkedList.ll_0_tuition;
import tutorials.ListNode;

import java.lang.reflect.Array;
import java.util.*;


// solution1 construct list , then check if it is a circle. (it doesn't work cuz one node can have duplicate prequists courses)

// todo 在 CourseSchedule 基础上,添加queue即可  注意时间复杂度 为n*n (还有笨方法, 先找到第一个无pre的, 解除相关的关联, 继续找下一个无pre的, 递归这个过程, 为 n power n)
public class graph_210_CourseSchedule2 {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        // todo special case 1
        System.out.println(Arrays.toString(findOrder(3, new int[][]{{1,2}, {1,0}, {2,1}}))); // expected false , todo 本题为所有pre都完事才可以选课
        System.out.println(Arrays.toString(findOrder(3, new int[][]{{1,2}, {1,0}, {2,0}})));


    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        return null;
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
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
