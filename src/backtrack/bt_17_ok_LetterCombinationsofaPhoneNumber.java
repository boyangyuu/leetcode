package backtrack;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bt_17_ok_LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        List list;Map map;
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++)
            if (digits.charAt(i) == '0' || digits.charAt(i) == '1') return res; //todo bug 1
        if (digits.length() == 0) return res; // todo bug 2

        Map<Integer, String[]> map = new HashMap<>();
        map.put(2, new String[]{"a", "b", "c"});
        map.put(3, new String[]{"d", "e", "f"});
        map.put(4, new String[]{"g", "h", "i"});
        map.put(5, new String[]{"j", "k", "l"});
        map.put(6, new String[]{"m", "n", "o"});
        map.put(7, new String[]{"p", "q", "r", "s"});
        map.put(8, new String[]{"t", "u", "v"});
        map.put(9, new String[]{"w", "x", "y", "z"});

        help(res, "", digits, map);

        return res;
    }

    public void help(List<String> list, String tmp, String digits, Map<Integer, String[]> map) {
        if (digits.length() == 0) {
            list.add(new String (tmp));
            return;
        }
        int key = digits.charAt(0) - '0';
        String[] strs = map.get(key);
        digits = digits.substring(1);
        for (int i = 0; i < strs.length; i++) {
            tmp += strs[i];
            help(list, tmp, digits, map);
            tmp = tmp.substring(0, tmp.length() - 1);
        }
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
 back track
 String tmp; // 作为tmp入栈


 ######s2######
 迭代法
 例如 222 , 1={abc} , => 3 * 3 * 3解法

 res = {""}; // 保存当前的res
 while(index < digits.length) {
    for(i : res) {
        string cur = res[i];
        res.remove //todo
        for (j : digits[index]){
            res.add //todo
        }
    }
 }

 ######sFinal######

 TODO case

 TODO bug
 bug1
 //
 =>
 if (digits.charAt(i) == '0' || digits.charAt(i) == '1') return res; //todo bug 1 本题 对 0 , 1是需要特殊处理, 题干没有写

 bug2
 //
 =>
 if (digits.length() == 0) return res; // todo bug 2


 bug3


 TODO follow

 */

/*
TODO tutorial


 */
