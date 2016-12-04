package $;

import java.util.*;

// todo 记住hashmap 的遍历规则 , 1.it的定义 2. it.next() 则进入下一个
// todo 本题很傻逼 , 建议


public class string_249_todo_GroupShiftedStrings {
    public static void main(String[] args) {
        List list;Map map;Set set;
//        System.out.println((-1+3)%3);

        System.out.println(groupStrings( new String[] {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"}));
        System.out.println(groupStrings( new String[] {"abd","bce", "abc", "abc"}));
    }

    public static List<List<String>> groupStrings(String[] strings) {
        HashMap<String, List<String>> m = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Iterator<HashMap.Entry<String, List<String>>> it = m.entrySet().iterator();
            boolean isAdded = false;
            while (it.hasNext()) {
                HashMap.Entry<String, List<String>> e = it.next();
                if (help(e.getKey(), strings[i])) {
                    m.get(e.getKey()).add(strings[i]);
                    isAdded = true;
                    break;
                }
            }
            if (isAdded) continue;
            List<String> l = new ArrayList<>();
            l.add(strings[i]);
            m.put(strings[i], l);
        }
        List<List<String>> res = new ArrayList<>();
        for (String s : m.keySet()) res.add(m.get(s));
        return res;
    }

    public static boolean help(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int offset = (s1.charAt(0) - s2.charAt(0) + 26) % 26;
        for (int i = 0; i < s1.length(); i++) {
            int o = s1.charAt(i) - s2.charAt(i);
            o = (o + 26) % 26;
            if (offset != o) return false;
        }
        return true;
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

 bug2
 bug3
 */




