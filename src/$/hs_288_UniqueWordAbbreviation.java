package $;

import java.util.Arrays;
import java.util.HashMap;

// todo bug1 是很没劲的一个bug 看清题意就好  A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.

public class hs_288_UniqueWordAbbreviation {
    HashMap<String, Integer> map = new HashMap<>();
    String[] dic;
    public static void main(String[] args) {
        hs_288_UniqueWordAbbreviation a = new hs_288_UniqueWordAbbreviation(new String[]{"a", "b", "abc", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"});
        System.out.println(a.isUnique("aa"));
        System.out.println(a.isUnique("b"));
        System.out.println(a.isUnique("aeec"));
        System.out.println(a.isUnique("aec"));

        //todo bug 1 case 同一个词 应该返回true hello属于unique
        hs_288_UniqueWordAbbreviation bug = new hs_288_UniqueWordAbbreviation(new String[]{"hello"});
        System.out.println(bug.isUnique("hello"));

        //todo bug 2 case dic 里有重复元素
        hs_288_UniqueWordAbbreviation bug1 = new hs_288_UniqueWordAbbreviation(new String[]{"hello", "hello"});
        System.out.println(bug1.isUnique("hello"));
    }

    public hs_288_UniqueWordAbbreviation(String[] dictionary) {
        this.dic = dictionary;
        Arrays.sort(this.dic);;
        for (int i = 0; i < this.dic.length; i++) {
            String ab = getAbb(this.dic[i]);
            if (i == 0 || !this.dic[i].equals(this.dic[i - 1])) {
                if (map.containsKey(ab)) map.put(ab, map.get(ab) + 1);
                else map.put(ab, 1);
            }
        }
    }

    public boolean isUnique(String word) {
        boolean f = false;
        String abb = getAbb(word);
        for (int i = 0; i < this.dic.length; i++) {
            if (word.equals(this.dic[i])) return map.get(abb) <= 1;
        }
        return !map.containsKey(abb);
    }

    public String getAbb(String word) {
        int cnt = 0;
        String res = "";
        if (word.length() <= 2) return word;
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) res += word.charAt(i);
            else if (i == word.length() - 1) res = res + cnt + word.charAt(i);
            else cnt++;
        }
        System.out.println(res);
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
 hashmap 记录 count即可
奇数count 出现次数>=2次, 则false

 ######s1######
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
