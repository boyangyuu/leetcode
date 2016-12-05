package $;

import java.util.*;

// todo 1 复习思路即可
// todo 2 复习 index 用法:  int end = s.indexOf('/' , start); // the index of "/"


public class string_271_todo_EncodeandDecodeStrings {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;
        list.add("abc");list.add("abcd");list.add("abce");
        System.out.println(decode(encode(list)));
    }

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        String res = "";
        for (int i = 0; i < strs.size(); i++) {
            res += strs.get(i).length() + "/" + strs.get(i);
        }
        System.out.println(res);
        return res;
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        int start = 0; // 定位到长度 index
        List<String> res = new ArrayList<>();
        while(start < s.length()) {
            int end = s.indexOf('/' , start); // the index of "/"
            System.out.println("start" + start);
            System.out.println(end);
            int l = Integer.parseInt(s.substring(start, end));
            start = end + l + 1;
            res.add(new String(s.substring(end + 1, start)));
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




