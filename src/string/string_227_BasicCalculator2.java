package string;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class string_227_BasicCalculator2 {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public int calculate(String s) {
        int res = 0, tmp = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == ' ') continue;
            if (cur >= '0' && cur <= '9')
                tmp = tmp * 10 + (cur - '0');
            if (cur < '0' || i == s.length() - 1){
                if (sign == '+') stack.push(tmp);
                if (sign == '-') stack.push(-tmp);
                if (sign == '*') {
                    int p = stack.pop();
                    stack.push(p * tmp);
                }
                if (sign == '/') {
                    int p = stack.pop();
                    stack.push(p / tmp);
                }
                sign = cur;
                tmp = 0;
            }
        }


        // step2
        while (stack.size() != 0) res += stack.pop();
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
 s1 todo comb!!!
 思想 利用 递归, 生成 return 之间的 运算, 之后无需考虑运算符的优先级问题, 好处是可以处理 todo 非常多的运算符!!!
 step 1
  将 数字,操作符 存入栈
 step 2
  递归形成
   int v = stack.pop();
   string op = stack.pop();
   return v op recursive(stack)

 s2 standard
 思想   碰到 +,- 数字入栈,
       碰到 * / 直接运算
       保存当前操作符 //todo 以便以后运算用
 step 1
 stack.push 各种运算 * / 后的数字

 step 2
 遍历取和


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




