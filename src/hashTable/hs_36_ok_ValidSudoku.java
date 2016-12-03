package hashTable;

import java.util.HashMap;
import java.util.HashSet;


//todo 最笨方法配上hashset 即可
public class hs_36_ok_ValidSudoku {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println('.' == '.');
    }

    public boolean isValidSudoku(char[][] board) {
        //each column
        int r = board.length, c = board[0].length;
//        HashMap<Integer, Character> m = new HashMap();
        HashSet<Character> m = new HashSet<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == '.') continue;
                if (m.contains(board[i][j])) return false;
                else m.add(board[i][j]);
            }
            m.clear();
        }

        //each row
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                if (board[i][j] == '.') continue;
                if (m.contains(board[i][j])) return false;
                else m.add(board[i][j]);
            }
            m.clear();
        }

        //each 9 cells
        for (int i = 0; i < r - 2; i+=3) {
            for (int j = 0; j < c - 2; j+=3) {
                // 9 cells
                for (int k = 0; k <= 2; k++) {
                    for (int l = 0; l <= 2; l++) {
                        if (board[i+k][j+l] == '.') continue;
                        if (m.contains(board[i+k][j+l])) return false;
                        else m.add(board[i+k][j+l]);
                    }
                }
                m.clear();
            }
        }

        return true;
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
todo alert 题目中的九宫格 是不重叠的

 TODO solotion
 hashTable store
 1. each row
 2. each column
 3. each 9 cells ,  from (0,0) to (r-3, c-3)

 TODO case

 TODO bug

 bug1
 must keep key as distinct
    else m.put(j, board[i+k][j+l]);
    else m.put(i+j+k+l, board[i+k][j+l]);
    else m.put((i+k)*j+l, board[i+k][j+l]);


 bug2
      put i => j
 bug3
 */

/*
TODO tutorial


 */
