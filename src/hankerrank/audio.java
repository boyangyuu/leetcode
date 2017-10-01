package hankerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by yuboyang on 7/3/17.
 */
public class audio {

    public static void main(String[] args) {
//        System.out.println(getAns("{}[]()"));
//        System.out.println(getAns("{[}])"));
        System.out.println(numberOfPairs(new int[]{6,6,3,9,3,5,1,}, 12));

    }

    static String[] braces(String[] values) {
        String[] res = new String[values.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getAns(values[i]);
        }
        return res;
    }

    static String getAns(String s) {
        String res = "YES";
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '{' || cur == '[')
                stack.push(cur);
            else {
                if (stack.size() == 0) {
                    res = "NO";
                    break;
                }
                char last = stack.pop();
                if (cur != map.get(last)) {
                    res = "NO";
                    break;
                }
            }

        }
        if (stack.isEmpty() == false) res = "NO";
        return res;

    }

    static int numberOfPairs(int[] a, long k) {
        Arrays.sort(a);

        int res = 0, i = 0, j = a.length - 1;
        while (i < j) {
            if (i != 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j != a.length - 1 && a[j] == a[j + 1]) {
                j--;
                continue;
            }
            int sum = a[i] + a[j];
            if (sum < k) i++;
            else if (sum > k) j--;
            else {
                res++;
                i++;
                j--;
            }

        }
        return res;

    }
}
