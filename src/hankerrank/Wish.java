package hankerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuboyang on 7/21/17.
 */
public class Wish {
    public static void main(String[] args) {
//        System.out.println(entryTime("511", "752961348"));

        System.out.println(Arrays.toString(buildSubsequences("abc")));
    }

    static String[] buildSubsequences(String s) {
        HashSet<String> set = new HashSet<>();
        help(set, "", s, 0);
        String[] res = new String[set.size()];
        int index = 0;
        for (String k : set) res[index++] = k;
        Arrays.sort(res);
        return res;
    }

    static void help(Set<String> set, String cur, String str, int start) {
        if (cur.length() != 0) set.add(cur);
        for (int i = start; i < str.length(); i++) {
            help(set, cur, str, i + 1);
            String temp = new String (cur);
            cur = cur + str.charAt(i);
            help(set, cur, str, i + 1);
            cur = temp;
        }
    }


    static int entryTime(String s, String keypad) {
        char[] order = s.toCharArray();
        char[] ck = keypad.toCharArray();
        int index = 0, res = 0;
        while (index < order.length - 1) {
            char cur = order[index]; // palindrome counter
            char next = order[index + 1];
            int icur = 0, inext = 0;
            for (int i = 0; i < ck.length ; i++) {
                if (ck[i] == cur) icur = i;
                if (ck[i] == next) inext = i;
            }
            int distance = Math.max(Math.abs(icur / 3 - inext / 3),
                    Math.abs(icur % 3 - inext % 3));
            res += distance;
            index ++;
        }
        return res;
    }




}
