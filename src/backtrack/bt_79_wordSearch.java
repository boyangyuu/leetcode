package backtrack;


import java.util.List;
import java.util.Map;

public class bt_79_wordSearch {
    public static void main(String[] args) {
        List list;Map map;
    }

    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) return false;
        boolean isExist = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                isExist |= help(board, word, i, j, 0);
                if(isExist) return true;
            }
        }
        return isExist;
    }

    public boolean help(char[][] board, String word, int r, int c, int index) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
        if (index == word.length() - 1) return board[r][c] == word.charAt(index);
        if (board[r][c] != word.charAt(index)) return false;
        index++;
        boolean res = false;
        board[r][c] = '*'; // todo follow
        res = help(board, word, r+1, c, index) // todo bug 3
                || help(board, word, r, c+1, index)
                || help(board, word, r-1, c, index)
                || help(board, word, r, c-1, index);

        board[r][c] = word.charAt(index-1);
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
 TODO translation

 TODO solotion
 ######s1######


 ######s2######

 ######sFinal######

 TODO case
 A B C E
 S F C S
 A D E E


 TODO bug
 bug1


 bug2



 bug3 todo!!\


 res |= help(board, word, r1, c1, index, visited);
 =>
 res = help(board, word, r+1, c, index)
 || help(board, word, r, c+1, index)
 || help(board, word, r-1, c, index)
 || help(board, word, r, c-1, index);  // todo bug3 这种写法一旦其中一个返回true, 则不会继续执行, 优化了速度!



 TODO follow
 use the space 1
 visited[r][c] = 1;
 =>
 board[r][c] = '*';
 board[r][c] = word[index-1]; // todo follow 利用board 做非法字符,起到visited 无效的效果

 */

/*
TODO tutorial


 */
