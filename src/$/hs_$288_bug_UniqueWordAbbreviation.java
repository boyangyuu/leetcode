package $;

import java.util.Arrays;
import java.util.HashMap;

// 本题bug 很多 注意bug case
// todo bug1 是很没劲的一个bug 看清题意就好  A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.

public class hs_$288_bug_UniqueWordAbbreviation {
    HashMap<String, String> map = new HashMap<>(); // abbreviation key to exsited element in dic(if door and deer, put the value = "")
    String[] dic;
    public static void main(String[] args) {
        hs_$288_bug_UniqueWordAbbreviation a = new hs_$288_bug_UniqueWordAbbreviation(new String[]{"a", "b", "abc", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"});
        System.out.println(a.isUnique("aa"));
        System.out.println(a.isUnique("b"));
        System.out.println(a.isUnique("aeec"));
        System.out.println(a.isUnique("aec"));

        //todo bug 1 case 同一个词 应该返回true hello属于unique
        hs_$288_bug_UniqueWordAbbreviation bug = new hs_$288_bug_UniqueWordAbbreviation(new String[]{"hello"});
        System.out.println(bug.isUnique("hello"));

        //todo bug 2 case dic 里有重复元素
        hs_$288_bug_UniqueWordAbbreviation bug1 = new hs_$288_bug_UniqueWordAbbreviation(new String[]{"hello", "hello"});
        System.out.println(bug1.isUnique("hello"));
    }

    public hs_$288_bug_UniqueWordAbbreviation(String[] dictionary) {
        this.dic = dictionary;
        Arrays.sort(this.dic);;
        for (int i = 0; i < this.dic.length; i++) {
            String ab = getAbb(this.dic[i]);
            if (i == 0 || !this.dic[i].equals(this.dic[i - 1])) {
                if (map.containsKey(ab)) map.put(ab, "");
                else map.put(ab, this.dic[i]);
            }
        }
    }

    public boolean isUnique(String word) {
        boolean f = false;
        String abb = getAbb(word);
        return !map.containsKey(abb) || map.get(abb).equals(word);
    }

    public String getAbb(String word) {
        int cnt = 0;
        if (word.length() <= 2) return word;
        String res = "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
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
 HashMap<String, String> map = new HashMap<>();
 // abbreviation key to exsited element in dic(todo !! if door and deer, put the value = "")
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



 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
