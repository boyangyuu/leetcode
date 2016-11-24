package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 转array char
public class string_344_ok_reverseString {

    public static void main(String[] args) {
        List list;Map map;Set set;
    }


    public String reverseString(String s) {
        StringBuffer res = new StringBuffer(s); //todo learn
        s = res.reverse().toString();
        return s;
    }

    // accepted
    public String reverseString11(String s){
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            char tmp = cs[i];
            cs[i] = cs[j];
            cs[j] = tmp;
            i++;j--;
        }
        return new String(cs);
    }


    //ETL
    public String reverseString1(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
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


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




