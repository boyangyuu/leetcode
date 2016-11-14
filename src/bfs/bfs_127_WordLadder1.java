package bfs;

import tree.TreeNode;

import java.util.*;

public class bfs_127_WordLadder1 {
    public static void main(String[] args) {
        List list;Map map;HashSet<Integer> set;
//        HashSet<String> set1 = new HashSet<>();
//        set1.add("hot");set1.add("dog");set1.add("dot");set1.add("hog");set1.add("hop");set1.add("tot");
//        set1.add("pot");set1.add("cog");
//        int res = ladderLength("hot", "dog", set1);
////        int res = ladderLength("hot", "dot", set1);
//        System.out.println(res);
    }


    public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        return 1;
    }

    static boolean isWordLadder(String word1, String word2) {
        int cnt = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i)!= word2.charAt(i)) cnt++;
            if(cnt >= 2) return false;
        }
        return cnt == 1;
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

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
