package companys.drawbridge;

/**
 * Created by yuboyang on 9/27/17.
 */
public class OA_DiamondMine {
    /*
    0, 1, 0
    0, 0, 0
    1, 1, 1


     */
    static int collect_max(int[][] mat) {
        int n = mat.length;
        dp = new int [n * 2][n][n];
        a = mat;
        return getAnswer(n);
    }

    private static int[][][] dp;
    private static int[][] a;
    static boolean isValid(int step, int x1, int x2, int n) {
        int y1 = step - x1, y2 = step - x2;
        return ((x1 >= 0) && (x1 < n) && (x2 >= 0) && (x2 < n) && (y1 >= 0) && (y1 < n) && (y2 >= 0) && (y2 < n))
                && a[x1][y1] != -1 && a[x2][y2] != -1;
    }

    static int getValue(int step, int x1,int x2,int n) {
        return isValid(step, x1, x2, n)?dp[step][x1][x2]: Integer.MIN_VALUE;
    }

    static int getAnswer(int n) {
        int P = n * 2 - 2;
        int i,j,step;

        for (i = 0; i < n; ++i) {
            for (j = i; j < n; ++j) {
                dp[0][i][j] = Integer.MIN_VALUE;
            }
        }
        dp[0][0][0] = a[0][0];
        for (step = 1; step <= P; ++step) {
            for (i = 0; i < n; ++i) {
                for (j = i; j < n; ++j) {
                    dp[step][i][j] = Integer.MIN_VALUE;
                    if (!isValid(step, i, j, n)) {
                        continue;
                    }
                    if (i != j) {
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i - 1, j - 1, n));
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i - 1, j, n));
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i, j - 1, n));
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i, j,n));
                        dp[step][i][j] += a[i][step - i] + a[j][step - j];
                    }
                    else {
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i - 1, j - 1, n));
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i - 1, j,  n));
                        dp[step][i][j] = Math.max(dp[step][i][j], getValue(step - 1, i, j,  n));
                        dp[step][i][j] += a[i][step - i];
                    }

                }
            }
        }
        if (dp[P][n - 1][n - 1] == Integer.MIN_VALUE) return 0;
        return dp[P][n - 1][n - 1] ;
    }
}
