package KMP;

import java.util.*;

/**
 * Created by yuboyang on 6/28/17.
 */
public class KMP_learn {
    static class Tree {
        Tree left;
        Tree right;
        int value;
        Tree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
//        System.out.println(matchIndex("bbc abcdab abcdabcdabde", "abcdabd"));


//        System.out.println(help(("1.1837 1.3829 0.6102")));
//        String[] strs = new String[]{
//            "Victor","Ver","Victor","Ver","Ryan","Ryan"
//        };
//        System.out.println(electionWinner(strs));
//        System.out.println(findMax(6, "3 4 5 1 3 # 1"));
//        System.out.println(findMax(6, "3 2 3 # 3 # 1"));


    }

//    static long findMax(int n, String tree) {
//        long res = 0;
//        // level
//        String[] nodes = tree.split(" ");
//        int level = 0;
//        while(true) {
//            if (Math.pow(2, level) >= nodes.length + 1) break;
//            level++;
//        }
//        System.out.println(Arrays.toString(nodes));
//        System.out.println("level: " + level);
//
//        // build dp
//        int[] sumOfLevels = new int[level];
//        int i = 1, index = 0; // i : curLevel , index : cur node's Index
//        List<Tree> trees = new ArrayList<>();
//        int root = Integer.parseInt(nodes[index]);
//        trees.add(new Tree(root));
//        index = 1;
//        while (index < nodes.length) {
//            for (int j = 0; j < trees.size(); j++) {
//                String curNode = nodes[index];
//                Tree cur = trees.get(j);
//                if (!curNode.equals("#")) {
//                    if (index % 2 == 1) {
//                        cur.left = new Tree(Integer.parseInt(curNode));
//                        index++;
//                    }
//                    else {
//                        cur.right = new Tree(Integer.parseInt(curNode));
//                        index++;
//                    }
//                }
//            }
//
//            if (!curNode.equals("#")) {
//                sumOfLevels[i - 1] += Integer.parseInt(curNode);
//            }
//
////            if (index + 1 == Math.pow(2, i)) i++;
//        }
////        System.out.println("dp:" + Arrays.toString(dp));
//
//        // get the maximum
//        int[] dp = new int[level];
//        dp[0] = sumOfLevels[0];
//        if (level == 1) return dp[0];
//        dp[1] = Math.max(dp[0], sumOfLevels[1]);
//        for (int j = 2; j < sumOfLevels.length; j++) {
//            dp[j] = Math.max(dp[j - 2] + sumOfLevels[j], dp[j - 1]);
//        }
//        return dp[level - 1];
//    }


    static String electionWinner(String[] votes) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> countsMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < votes.length; i++) {
            String cur = votes[i];
            countsMap.put(cur, 1 + countsMap.getOrDefault(cur, 0));
            max = Math.max(max, countsMap.get(cur));
        }

        // added intp res
        for (String key : countsMap.keySet()) {
            if (countsMap.get(key) == max) res.add(key);
        }

        // find by alpha
//        System.out.println(res);
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

//        System.out.println(res);
        return res.get(res.size() - 1);
    }


    static int[] arbitrage(String[] quotes) {
        int[] res = new int[quotes.length];
        for (int i = 0; i < quotes.length; i++) {
            res[i] = help(quotes[i]);
        }
        return res;
    }

    static int help(String s) {
        String[] arrs = s.split(" ");
        double[] arrsInt = new double[arrs.length];
        for (int i = 0; i < arrsInt.length; i++) {
            arrsInt[i] = Double.parseDouble(arrs[i]);
        }
        System.out.println("arrs: " + arrsInt);
        double profit = 100000 / arrsInt[0] / arrsInt[1] / arrsInt[2] -  100000;
        return profit > 0 ? (int)(profit) : 0;
    }


//    public static int matchIndex(String string, String target) {
//        // 1. build next
//        int[] next = new int[target.length()]; // 该字符匹配失败后, 模式串应该跳到的位置 (前缀后缀最长相同长度-1)
//        next[0] = -1;
//        int s1 = 1, s2 = 1; // 前缀位置, 后缀位置
//        while (s2 < target.length() - 1) {
//            if (target.charAt(s1) == target.charAt(s2)) {
//                next[s2++] = s1++;
//            }
//            else {
//
//            }
//        }
//
//    }

}
