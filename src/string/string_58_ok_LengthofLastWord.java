package string;

public class string_58_ok_LengthofLastWord {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int cnt = 0, tmp = 0, index = 0;  // todo bug 1
        while (index < s.length()){
            if(s.charAt(index) == ' ') tmp = 0;
            else cnt = ++tmp;
            index++;
        }
        return cnt;
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
 todo!! case1
 "aaa bb cc   "
 output : 0
 expected: 2

 TODO bug

 bug1
 int cnt = 0, index = 0;  // todo!! bug 1
 =>
 int cnt = 0, tmp = 0, index = 0;  // todo bug 1
 bug2
 bug3
 */




