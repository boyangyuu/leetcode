package backtrack;

import java.util.*;

public class bt_127_WordLadder {
    public static void main(String[] args) {
        List list;Map map;HashSet<Integer> set;
        HashSet<String> set1 = new HashSet<>();
        set1.add("hot");set1.add("dog");set1.add("dot");
        set1.add("hog");set1.add("hop");set1.add("tot");
        set1.add("pot");set1.add("cog");
        int res = ladderLength("hot", "dog", set1);
//        int res = ladderLength("hot", "dot", set1);
        System.out.println(res);
    }

    static int minLength = Integer.MAX_VALUE;

    public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        help(beginWord, endWord, wordList, new HashSet<String>(), 1);
        if (minLength == Integer.MAX_VALUE) minLength = 0;
        return minLength;
    }

    static void help(String beginWord, String endWord, Set<String> wordList, Set<String> visited, int length) {
        if (visited.size() != 0 && isWordLadder(beginWord, endWord)) {
            minLength = Math.min(length, minLength);
            return;
        }
        for (String s : wordList) { //todo bug 1 java.util.ConcurrentModificationException
            if (!visited.contains(s) && isWordLadder(beginWord, s)) {
                visited.add(s);
                help(s, endWord, wordList, visited, length + 1);
                visited.remove(s);
            }
        }
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
