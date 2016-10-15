package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_165_CompareVersionNumbers {
    public static void main(String[] args) {
        List list;Map map;Set set;
        System.out.println(Integer.parseInt("1.01"));
    }

    public int compareVersion(String version1, String version2) {
        String[] v1s = version1.split("\\.");
        String[] v2s = version2.split("\\.");
        int l = Math.max(v1s.length, v2s.length);
        for (int i = 0; i < l; i++) {
            int v1 = i >= v1s.length ? 0 : Integer.parseInt(v1s[i]);
            int v2 = i >= v2s.length ? 0 : Integer.parseInt(v2s[i]);
            if (v1 == v2) continue;
            else return v1 > v2 ? 1 : - 1;
        }
        return 0;
    }

}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation
 decimal 小数的
 可以有几个 。??

 TODO solotion


 TODO case
 case 1
 "1" "0"

 case 2
 "1.1" <  "1.1.1"

 "1.1" == "1.1.0"

 "1.1" > "1.1.-1"

 TODO bug

 bug1
 String[] v1s = version1.split("\\."); todo bug1
 =>
 String[] v1s = version1.split("."); todo bug1
 todo tutorial : split : "." "*" "|" , String[] v1s = version1.split("\\.");

 bug2
 bug3
 */




