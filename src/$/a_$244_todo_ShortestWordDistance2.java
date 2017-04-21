package $;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 第一次就一遍过
// todo 第二次反而懵逼没思路突然


public class a_$244_todo_ShortestWordDistance2 {
    private HashMap<String, List<Integer>> map = new HashMap<>();
    private String[]words;

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println("2".compareTo("12"));

//        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
//                "coding", "practice"));
//
//        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
//                "makes", "coding"));
    }

    public a_$244_todo_ShortestWordDistance2(String[] words) {
        this.words = words;
        for (int i = 0; i < words.length; i++){
            if (map.containsKey(words[i])) map.get(words[i]).add(i);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(words[i], list);
            }
        }

    }

    public int shortest(String word1, String word2) {
        int i1 = 0, i2 = 0, res = words.length;
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);


        // 1,2     3,4
        while (i1 != l1.size() || i2 != l2.size()) {
            res = Math.min(res, Math.abs(l2.get(i2) - l1.get(i1)));
            if (i1 == l1.size() || l1.get(i1) > l2.get(i2)) i2++;
            else i1++;
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