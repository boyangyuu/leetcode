package dfs;

import tree.TreeNode;
// 12/16   12:00-12.19
// todo 反应略慢, 记住思路即可
public class dfs_200_NumberofIslands {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;

        System.out.println(numIslands(new char[][]{"11110".toCharArray(),
                "11010".toCharArray(),
                "11000".toCharArray(),
                "00000".toCharArray()}));
        System.out.println(numIslands(new char[][]{"11000".toCharArray(),
                "11000".toCharArray(),
                "00100".toCharArray(),
                "00011".toCharArray()}));
    }



    public static int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int[][] visited = new int[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == '1'
//                        &&(i == 0 || visited[i - 1][j] == 0)
//                        && (j == 0 || visited[i][j-1] == 0)
//                        && (i == grid.length - 1 || visited[i+1][j] == 0)
//                        && (j == grid[0].length - 1 || visited[i][j + 1] == 0)) {
//                    res++;
//                    help(visited, grid, i, j);
//                }
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    res++;
                    help(visited, grid, i, j);
                }
            }
        }

        return res;
    }

    public static void help(int[][] visited, char[][]grid,  int i, int j) {
        if (i < 0 || i >= visited.length || j < 0 || j >= visited[0].length) return;
        if (visited[i][j] == 1) return;
        if (grid[i][j] == '0') return;
        visited[i][j] = 1;
        help(visited, grid, i - 1, j);
        help(visited, grid, i + 1, j);
        help(visited, grid, i, j - 1);
        help(visited, grid, i, j + 1);

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
 每次找到一个 1(该元素没有访问过), 将其所有的同一个岛的位置,置为访问过
备注 出现1个新1, 则意味着一个岛

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
