import java.util.*;

public class Main {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */

    public static int[] father;

    public static void main(String[] args) {
        double a = Math.sqrt(-50);
        double b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        if (a == b) System.out.println("aa");
    }

    void reverse(String s) {
        if (s.length() == 0) return;
        System.out.println(s.charAt(0));
        StringBuffer sb = new StringBuffer();
        sb.append(s.substring(1));
        reverse(sb.reverse().toString());
    }


    public int numIslands(boolean[][] grid) {

        if (grid.length == 0 || grid[0].length == 0) return 0;
        father = new int[grid.length * grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int index = i * grid.length + j;
                if (grid[i][j])
                    father[index] = index;
                else
                    father[index] = -1;
            }
        }

        

        //
        int[][] direct = {{1,0}, {-1,0}, {0, 1}, {0,-1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int k = 0; k < direct.length; k++) {
                    int i1 = i + direct[k][0];
                    int j1 = j + direct[k][1];
                    if (0 <= i1 && i1 < grid.length && 0 <= j1 && j1 < grid[i].length && grid[i1][j1] && grid[i][j]) {
                        union(getIndex(i, j, grid), getIndex(i1, j1, grid)) ;
                    }
                }
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int e : father) {
            if (e != -1) {
                System.out.println(e);
                set.add(e);
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();

        HashMap<Character, Integer> mapOri = (HashMap<Character, Integer>) map.clone();

        return set.size();

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
        if (ra != rb ) {
            father[ra] = rb;
            return true;
        }
        return false;

    }

    public int getIndex(int i, int j, boolean[][] grid) {
        return i * grid.length + j;
    }

}