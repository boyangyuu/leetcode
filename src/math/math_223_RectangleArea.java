package math;

public class math_223_RectangleArea {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        boolean isUnCovered = A > G || B > H || C < E || D < F;
        int sum = (C - A) * (D - B) + (G - E) * (H - F);
        if (isUnCovered) return sum;
        else return sum - (Math.min(G, C) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
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
 TODO translation


 TODO solotion
 step 1. 先想方法让2个矩阵不相交
 感觉上 肯定是需要控制四个顶点, 于是得到

 boolean isCovered = A > G || B > H || C < E || D > F;

 证明:
 矩形2 不在 矩形1的话, 即 矩形2的四个顶点均不在矩形1中,
 而A (矩形1最左下的点) > G(矩形2最右上的点) 的话 ,


 step 2
 相交的部分

 左下顶点   max(A,E), max(B，F)
 右上顶点   min(G,C), min(D, H)


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial


 */
