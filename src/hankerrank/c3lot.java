package hankerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuboyang on 6/25/17.
 */
public class c3lot {
    public static void main(String[] args) {
//        System.out.println(getAns("GRGL"));
//        System.out.println(getSim("ababaa"));
        System.out.println(getDivisibility("61"));
        System.out.println(getDivisibility("123"));
    }


    static String[] checkDivisibility(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = getDivisibility(arr[i]);
        }
        return res;

    }

    static String getDivisibility(String input) {
        int[] ints = new int[input.length()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = input.charAt(i) - '0';
        }
        HashSet<Integer> set = new HashSet<>();
        help("", ints, set, new int[ints.length]);
        System.out.println(set);
        for (Integer cur : set) if (cur % 8 == 0) return "YES";
        return "NO";
    }

    static void help (String cur, int[] input, Set<Integer> set, int[] visited) {
        if (cur.length() == input.length) {
            set.add(Integer.parseInt(cur));
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (visited[i] == 0 && input[i] != input[i - 1]) {
                visited[i] = 1;
                cur += input[i];
                help(cur, input, set, visited);
                cur = cur.substring(0, cur.length() - 1);
                visited[i] = 0;
            }
        }
    }



    static int[] stringSimilarity(String[] inputs) {
        int[] res = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            res[i] = getSim(inputs[i]);
        }
        return res;
    }

    static int getSim(String input) {
        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            String suffix = input.substring(i);
//            System.out.println("suffix: " + suffix);
            int num = 0;
            for (int j = 0; j < suffix.length(); j++) {
                char cur1 = input.charAt(j);
                char cur2 = suffix.charAt(j);
                if (cur1 != cur2) break;
                num++;
            }
            res += num;
        }
        return res;
    }




    static String[] doesCircleExist(String[] commands) {
        String[] res = new String[commands.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getAns(commands[i]);
        }
        return res;

    }

    static String getAns(String commands) {
        int x = 0, y = 0;
        int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
        int dirIndex = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < commands.length(); i++) {
            char cur = commands.charAt(i);
            if (cur == 'G') {
                x += dirs[dirIndex][0];
                y += dirs[dirIndex][1];
                set.add(x + "_" + y);
            } else if (cur == 'L') {
                dirIndex = (dirIndex - 1 + 4) % 4;
            } else if (cur == 'R')
                dirIndex = (dirIndex - 1 + 4) % 4;
        }

return "";
    }

}
