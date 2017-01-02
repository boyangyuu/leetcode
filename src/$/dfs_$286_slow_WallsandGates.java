package $;

import java.util.List;

// todo slow 建立与其他题的关联
//

public class dfs_$286_slow_WallsandGates {

    public static void main(String[] args) {

    }

    public static void wallsAndGates(int[][] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 0) {
                    int expected = 0;
                    help(rooms, i + 1, j, expected + 1);
                    help(rooms, i - 1, j, expected + 1);
                    help(rooms, i, j + 1, expected + 1);
                    help(rooms, i, j - 1, expected + 1);
                }
            }
        }
    }

    public static void help(int[][] rooms, int i, int j, int expected) {
        if (i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length) return;
        if (rooms[i][j] == -1) return;

        if (rooms[i][j] > expected) { // todo 这块比较关键
            rooms[i][j] = expected;
            help(rooms, i + 1, j, expected + 1);
            help(rooms, i - 1, j, expected + 1);
            help(rooms, i, j + 1, expected + 1);
            help(rooms, i, j - 1, expected + 1);
        }
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
