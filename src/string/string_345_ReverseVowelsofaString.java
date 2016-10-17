package string;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_345_ReverseVowelsofaString {

    public static void main(String[] args) {
        List list;Map map;Set set;
    }


    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int i = 0, j = cs.length - 1;
        while (i < j) {
            if (!set.contains(cs[i]))i++;
            else if (!set.contains(cs[j]))j--;
            else {
                char tmp = cs[i];
                cs[i] = cs[j];
                cs[j] = tmp;
                i++;j--;
            }
        }
        return new String(cs);
    }


}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation

 vowels : 元音
 包括 A、E、I、O、U


 TODO solotion


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




