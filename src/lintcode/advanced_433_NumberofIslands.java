package lintcode;

import java.lang.reflect.Array;
import java.util.*;

public class advanced_433_NumberofIslands {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */

    public int[] father;
    public int cnt = 0;
    public static void main(String[] args) {
        System.out.println(new advanced_433_NumberofIslands().numIslands(new boolean[][]{
                {true, true, true, true, true, true}
                , {true, false, false, false, false, true}
                , {true, false, true, true, false, true}
                , {true, false, false, false, false, true}
                , {true, true, true, true, true, true}}));

    }

    public int numIslands(boolean[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        father = new int[grid.length * grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int index = i * grid[0].length + j;
                father[index] = index;
                if (grid[i][j]) cnt++;
            }
        }

        //
        int[][] direct = {{1, 0}, {0, 1}, {-1,0}, {0,-1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int k = 0; k < direct.length; k++) {
                    int i1 = i + direct[k][0];
                    int j1 = j + direct[k][1];
                    if (0 <= i1 && i1 < grid.length && 0 <= j1 && j1 < grid[i].length && grid[i1][j1] && grid[i][j]) {
                        System.out.println(i + ", " + j + "  ;" + i1 + ", " + j1);

                        union(getIndex(i, j, grid), getIndex(i1, j1, grid)) ;
                    }
                }
            }
        }
        return cnt;
    }

    public int find(int a) {
        if (a == father[a]) return a;
        else {
            return father[a] = find(father[a]);
        }
    }

    public boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra != rb) {
            father[ra] = rb;
            cnt--;
            System.out.println("cnt:" + cnt);
            return true;
        }

        return false;
    }

    public int getIndex(int i, int j, boolean[][] grid) {
        return i * grid[0].length + j;
    }

}