package $;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


// todo 1、写上注释会清晰很多
// todo 建议强记本题
public class hs_$311_rem_SparseMatrixMultiplication {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[][] res = multiply(new int[][]{{1,0,0},{-1,0,3}}, new int[][]{{7,8},{0,0},{0,0}});
        int[][] res1 = multiply1(new int[][]{{1,0,0},{-1,0,3}}, new int[][]{{7,8},{0,0},{0,0}});
        System.out.println(Arrays.deepToString(res));
        System.out.println(Arrays.deepToString(res1));

    }

    // best solution converted from s1, then can easily ignore 0!
    public static int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for (int i = 0; i < res.length; i++) { // i 是 A的行数 （res的行数）
            for (int k = 0; k < A[0].length; k++) { // k 是A的列数 B的行数
                if (A[i][k] == 0) continue;
                for (int j = 0; j < res[0].length; j++) { // j 是B的列数 （res的列数）
                    if (B[k][j] == 0) continue;
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }
    // slow and can not ignore zero
    public static int[][] multiply1(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for (int i = 0; i < res.length; i++) { // i 是 A的行数 （res的行数）
            for (int j = 0; j < res[0].length; j++) { // j 是B的列数 （res的列数）
                for (int k = 0; k < A[0].length; k++) { // k 是A的列数 B的行数
                    res[i][j] += A[i][k] * B[k][j];
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
