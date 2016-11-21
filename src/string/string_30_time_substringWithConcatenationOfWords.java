package string;

import java.util.*;

// todo On 方法 建议 直接看http://www.cnblogs.com/grandyang/p/4521224.html的最佳解法

public class string_30_time_substringWithConcatenationOfWords {
    public static void main(String[] args) {
        List list;Map map;Set set;
        List<String> words = new ArrayList<String>();
        words.add("foo");words.add("bar");
//        System.out.println(findSubtring("barfoothefoobarman", words));

    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (words.length == 0) return res;
        HashMap<String, Integer> map = new HashMap();
        for (String e : words) {
            if (map.containsKey(e)) map.put(e, map.get(e) + 1);
            else map.put(e, 1);
        }

        int l = words[0].length();
        for (int i = 0; i < s.length() - words.length * l + 1; i++) {
            HashMap<String, Integer> tmap = new HashMap(map);
            for (int j = i; j < s.length() - l + 1; j += l) {
                String cur = s.substring(j, j + l);
                if (tmap.containsKey(cur)) {
                    if (tmap.get(cur) == 1) tmap.remove(cur);
                    else tmap.put(cur, tmap.get(cur) - 1);
                }
                else break;
                if (tmap.size() == 0) {
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }

}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
 ######s1######
 Set
 检查每位是否满足条件

 --performance
 time: s.l * words.l
 space: n

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

 bug2
 bug3
 */




