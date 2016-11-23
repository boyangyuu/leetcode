package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// todo 倒着数 count the ".."即可 , ignore the ".", ""
public class string_71_ok_simplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }

    public static String simplifyPath(String path) {
        String res = "";
        String[] paths = path.split("/");
        int cnt = 0; // cnt of ".."
        for (int i = paths.length - 1; i >= 0; i--) {
            String cur = paths[i];
            if (cur.equals("") || cur.equals(".")) continue;
            else if (cur.equals("..")) cnt++;
            else { // normal str
                if (cnt != 0) cnt--;
                else res = "/" + cur + res;
            }
        }

        if (res == "") return "/"; // todo 特殊case : "" except: "/"
        else return res;
    }
}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation
 1、 ./代表 当前目录 可省略
 2、 ../返回上一级
 3、 ..../没有这个东西


 TODO solotion

 //注意 最好用 java 的 split 分割, 手动分割比较难,情况多 (simplifyPath1)
 step 1
 String[] strs = split;

 step 2
 倒序遍历, 遇到..就记录 cnt++, 遇到正常字符就check cnt , cnt>0 则忽略本次字符
 if (..) cnt++
 else if cnt >=0 cnt--
 else res = res + cur + "/";


 TODO case
 case1
 Input "/..." // 注意 不一定是/ 来收尾
 output : "/"
 expected: "/..."  //???

 TODO bug


 bug1
 //
 =>
 if (strs[i].equals("")) continue; // todo bug1 split will probl create ""

 bug2
 else res += "/" + strs[i]; // todo bug2 自己比划一遍！！
 =>
 else res = "/" + strs[i] + res; // todo bug2 自己比划一遍！！
 bug3
 */




