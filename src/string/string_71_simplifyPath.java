package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class string_71_simplifyPath {
    public static void main(String[] args) {

    }

    public String simplifyPath(String path) {
        String[] strs = path.split("/"); // todo learn!
        String res = "";
        int cnt = 0;
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("")) continue; // todo bug1 split will probl create ""
            if (strs[i].equals("..")) cnt++;
            else if (strs[i].equals("."));
            else if (cnt > 0) cnt--;
            else res = "/" + strs[i] + res; // todo bug2 自己比划一遍！！
//            System.out.println(strs[i]);
//            System.out.println(res);
        }
        if (res == "") return "/";
        else return res;
    }


    public String simplifyPath1(String path) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        String cur = "";
        while(++i < path.length()){
            if (path.charAt(i) == '/') {
                stack.push(cur);
                cur = "";
            } else {
                cur += path.charAt(i);
            }
        }

        String res = "";
        int cnt = 0;
        while(!stack.empty()){
            String curs = stack.pop();
            if (curs.equals("..")) cnt++;
            else if (cur.equals("."));
            else {
                if (cnt > 0) cnt--;
                else res += "/" + curs;
            }
        }

        return res;
    }

    //use java split

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
 倒序遍历,
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




