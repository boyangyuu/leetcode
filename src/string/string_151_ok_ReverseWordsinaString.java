package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_151_ok_ReverseWordsinaString {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public String reverseWords(String s) {
        String res = "", tmp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            if (cur == ' ') {
                if (!tmp.equals("")){
                    res += tmp + " ";
                    tmp = "";
                } else continue;
            } else
                tmp = cur + tmp;
        }
        if (tmp.equals("") == false) res += tmp;
//        if (res.charAt(res.length() - 1) == ' ') res = res.substring(0, res.length() - 1);
        res = res.trim();
        return res;
    }

    public String reverseWords1(String s) {

        return "";
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

 做之前 最好trim一下
 或者做完之后 trim

 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




