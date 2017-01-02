package $;

// todo slow 建立与其他题的关联
// todo!! 提交的时候 overflow 不用管它

public class dfs_$130_slow_SurroundedRegions {

    public static void main(String[] args) {

    }

    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1)
                    if (board[i][j] == 'O') help(board, i, j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'A') board[i][j] = 'X';
            }
        }
    }

    public void help(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (board[i][j] == 'O') {
            board[i][j] = 'A';

            if (i >= 1 && board[i-1][j] == 'O')
                help(board, i-1, j);
            if (i < board.length - 1 && board[i+1][j] == 'O')
                help(board, i+1, j);
            if (j >= 1 && board[i][j-1] == 'O')
                help(board, i, j-1);
            if (j < board[i].length - 1 && board[i][j+1] == 'O' )
                help(board, i, j+1);
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
