package companys.audible;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuboyang on 7/25/17.
 */

/*
input "cat dog  bitch" => "cat", "dog", "bitch"

"cat dog  bitch" => 3,   cat, dog => 2, bitch=>1  => 3

HashMap<Integer, Integer> map // key is the length, value is times

map [3:2, 5:1]

int maxTimes;
int maxKey;
for (Integer key : map.keySet()) {
    int cur = map.get(key);
    if (cur > maxTimes) {
        maxTimes = cur;
        maxKey = key;
    }
}

return maxKey;




 */

public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(getWords("cat dog  bitch    "));
        System.out.println(getWords("   cat  dog  bitch    "));
    }




    static List<String> getWords(String s) {
        List<String> res = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                tmp += c;
            }
            if ((c == ' ' || i == s.length() - 1) && !tmp.equals("")) {
                res.add(tmp);
                tmp = "";
            }
        }
        return res;
    }

}
