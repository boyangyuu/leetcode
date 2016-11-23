package backtrack;
import java.util.*;


//todo do not need code just remeber how string convert to int
public class bt_93_todo_RestoreIPAddresses {
    public static void main(String[] args) {
        //case1 考虑255边界
        List<String> res = restoreIpAddresses("25525511135");
        System.out.println(res);

        //case2 考虑0
        List<String> res1 = restoreIpAddresses("0000");
        System.out.println(res1);

        //case3 考虑过小 11,1,1,?
        List<String> res2 = restoreIpAddresses("1111"); // todo bug case 2
        System.out.println(res1);

    }

    //Given "25525511135",
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        help(res, 4, 0, s, "");
        return res;
    }

    static void help(List<String> res, int stage, int index, String s, String tmp) {
        if (index + stage * 3 < s.length()) return;
        if (stage == 0) {
            res.add(new String(tmp));
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (index >= s.length() || s.charAt(index) == '0' && i > 0) break; // case0.0.0.0 todo bug 2
            int newIndex = index + i + 1;
            if (newIndex > s.length()) break; //todo bug 1
            String cur = s.substring(index, newIndex); // case 255255 => 2,25,255
            if (Integer.parseInt(cur) > 255) break; // todo case1
            if (stage > 1) cur += '.';
            tmp += cur;
            help(res, stage - 1, newIndex, s, tmp);
            tmp = tmp.substring(0, tmp.length() - cur.length());
        }
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

 String cur = s.substring(index, newIndex); // case 255255 => 2,25,255
 =>
 if (newIndex > s.length()) break; //todo bug 1 喷到容易出界的地方 就要检测, s.substring...
 String cur = s.substring(index, newIndex); // case 255255 => 2,25,255

 bug2
 类似 bug1 要检测

 bug3
 */




