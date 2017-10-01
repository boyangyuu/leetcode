package hankerrank;

import java.util.*;

/**
 * Created by yuboyang on 7/5/17.
 */
public class Peer {
    public static void main(String[] args) {
//        System.out.println(getAns("61"));
        System.out.println(getAns("abcd"));
    }


//    static String[] checkDivisibility(String[] arr) {
//        String[] ans = new String[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            ans[i] = getAns(arr[i]);
//        }
//        return ans;
//    }
//
//    static String getAns(String str) {
//        char[] chars = str.toCharArray();
//        Arrays.sort(chars);
//        List<Integer> list = new ArrayList<>();
//        help(list, chars, 0, new int[chars.length]);
//        System.out.println(list);
//        for (int i : list) if (i % 8 == 0) return "YES";
//        return "NO";
//    }

    static void help(List<Integer> list, char[] chars, int temp, int[] visited) {
        String temps = "" + temp;
        if (temps.length() == chars.length) {
            list.add(temp);
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            int cur = chars[i] - '0';
            if (visited[i] == 0) {
                if (cur == 0 && temp == 0) continue;
                visited[i] = 1;
                help(list, chars, 10 * temp + cur, visited);
                visited[i] = 0;
            }
        }
    }

    static int[] mystery(String[] letter) {
        int[] res = new int[letter.length];
        for (int i = 0; i < letter.length; i++) {
            res[i] = getAns(letter[i]);
        }
        return res;

    }

    static int getAns(String s) {
        int l = 0, r = s.length() - 1, res = 0;
        while (l <= r) {
            char lc = s.charAt(l),rc = s.charAt(r);
            res += Math.abs(lc - rc);
            l++;r--;

        }
        return res;


    }

    static

    private class Pair {
        int start;
        int end;
    }



}
