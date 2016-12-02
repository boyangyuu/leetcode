package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 一遍通过 简单复习下思路
public class a_245_todo_$ShortestWordDistance3 {
    private HashMap<String, List<Integer>> map = new HashMap<>();
    private String[]words;

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List list;Map map;

        System.out.println(shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "coding", "practice"));

        System.out.println(shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "makes", "coding"));
    }

    public static int shortestWordDistance(String[] words, String word1, String word2) {
        int i1 = -1, i2 = -1, res = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                if (i1 != -1 && word1.equals(word2)) res = Math.min(res, i - i1);
                i1 = i;
            } else if (words[i].equals(word2)) {
                i2 = i;
            }
            if (i1 != -1 && i2 != - 1) res = Math.min(res, Math.abs(i1 - i2));
        }
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


 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######

 TODO case

 TODO bug

 TODO follow
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */