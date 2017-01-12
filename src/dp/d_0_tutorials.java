package dp;



public class d_0_tutorials {
    public static void main(String[] args) {

    }



}

/*
todo tutorial
 TODO 判断是否是dp
 1. 带有阶段性
 2. 带有最优性
 3. DFS 存在重复计算, 需要自底向上
 4. 当前状态 i 可以由以前状态来计算


 TODO 解空间构造
 dp指代 , 一共分情况
  1、dp[n]代表着最优解解 和
  2、max{dp[1],,,dp[n]} 为最优解 其中dp[i] 代表着end with x[i] 时的解

 dp 偶尔带有状态, 比如paint 三种颜色, d_376_WiggleSubsequence 中 两个方向, 这种要用多个dp
 如dp_red, dp_up


 dp解空间, 大概也分2种
  1、 dp = max{dp[n-1], dp[n-2]}
  2、 dp = max {
        dp[j1]
        dp[j2]    // under some condition
        ....
  }

 有时候, dp里面的i 也比较难想, 例如 377. Combination Sum IV

 TODO dp空间降维


 */
