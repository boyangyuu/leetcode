package array;

// todo next time code
public class a_289_GameofLife {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    /*
1. 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡

2. 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活

3. 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡

4. 如果死细胞周围正好有三个活细胞，则该位置死细胞复活

    0 0-0  //todo! 要用 0, 1, 2, 3 方便些 不要用1,2,3,4
    1 1-1
    2 0-1
    3 1-0
     */

    public void gameOfLife(int[][] board) {
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1}; // todo!! 重点1 建立矢量坐标
        int[] dc = {-1, 0, 1,  -1, 1, -1, 0, 1};
        for (int i = 0; i < board.length; i++) {  // r
            for (int j = 0; j < board[0].length; j++) { // c
                int cnt = 0;
                for (int k = 0; k < 8; k++) {
                    int r = i + dr[k];
                    int c = j + dc[k];        //  bug1
                    if (r >= 0 && r < board.length
                         && c >= 0 && c < board[0].length
                         &&(board[r][c] == 1 ||board[r][c] == 3))  //活着的cnt
                        cnt++;

                }

                if(board[i][j] == 1 && (cnt < 2 || cnt > 3)) board[i][j] = 3; // 1, 3 : 1=>0
                else if (board[i][j] == 0 && cnt == 3) board[i][j] = 2; //2 4 : 0=>1
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2) board[i][j] = 1;
                if (board[i][j] == 3) board[i][j] = 0;
            }
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

todo solution

 guan

todo bug
 bug1
 bug2
 bug3
 */