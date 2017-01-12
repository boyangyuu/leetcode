package binarySearch;


import java.util.*;


// todo try to learn treeset
public class bs_392_todo_IsSubsequence {
    public static void main(String[] args) {

    }

    /*
    1. maintain 2 points i starts from s[0] and j starts from t[0], if same, i++,j++, if not, j++;

    2. follow up

    use space to exchange time, use map or List or Treeset to store the t, the key is the letter, and the value is the index.
 ....

    */
    public boolean isSubsequence1(String s, String t) {
        List<Integer>[] idx = new List[256];
        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            if (idx[c] == null) idx[c] = new ArrayList<>();
            idx[c].add(i);
        }

        int pre = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (idx[c] == null) return false;
            int index = Collections.binarySearch(idx[c], pre);
            if (index < 0) index = - index - 1;
            if (index == idx[c].size()) return false;
            pre = idx[c].get(index) + 1;
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


 TODO solotion
 ######s1######


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
