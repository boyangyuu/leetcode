package string;

public class string_38_CountandSay {
    public static void main(String[] args) {
        
    }
    public String countAndSay(int n) {
        String res = "1";
        while (--n > 0) {
            int cnt = 0;
            String tmp = "";
            for (int i = 0; i < res.length(); i++) {
                cnt++;
                char c1 = res.charAt(i);
                if (i == res.length() - 1) {
                    // System.out.println("added before:" + tmp);
                    tmp += cnt + "" + c1; //todo bug 1
                    // System.out.println(tmp);
                    continue;
                }

                char c2 = res.charAt(i + 1);
                if (c1 != c2) {
                    tmp += cnt + "" + c1;
                    cnt = 0;
                }
            }
            res = tmp;
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
 当前数字迭代产生下一个数字而已


 TODO solotion



 TODO case

 TODO bug

 bug1
 tmp += cnt + c1; //todo bug 1 这样写 cnt + c1 会产生运算
 =>
 tmp += cnt + "" + c1; //todo bug 1

 bug2
 bug3
 */




