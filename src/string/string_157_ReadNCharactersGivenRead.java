package string;

/**
 * Created by yuboyang on 3/15/17.
 */
public class string_157_ReadNCharactersGivenRead {
    public static void main(String[] args) {
        char[] buf = {};
        System.out.println(read(buf, 1));

    }

    public static int read(char[] buf, int n) {
        int i = 0;
        if (n == 0) return 0;
        while (i != buf.length && i <= n) {
            char[] temp;
            int l = buf.length - i; // remain length
            if (l <= 4) temp = new char[l];
            else temp = new char[4];

            int tempIndex = 0;
            int cur = i;
            for (char c : temp) {
                temp[tempIndex++] = buf[cur++];
            }
            int cnt = read4(temp);
            i += cnt;
        }

        return Math.min(i, n);
    }

    public static int read4(char[] chars) {
        return 4;
    }

}
