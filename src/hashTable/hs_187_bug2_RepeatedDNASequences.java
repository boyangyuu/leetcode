package hashTable;

import java.util.*;


// 2016/12/14 5.10pm-5.40pm:
// todo 1、题意没理解清楚, 2、高估算法复杂度, 3、答案不允许重复元素。
public class hs_187_bug2_RepeatedDNASequences {
    public static void main(String[] args) {

        // todo bug case1 理解错题意 // AAAAACCCCC, AAAAACCCCCC, AAAAACCCCC
        System.out.println(findRepeatedDnaSequences1("AAAAAAAAAAA")); // output [],  expected ["AAAAAAAAAA"] allow intersectation

        // todo bug case2
        System.out.println(findRepeatedDnaSequences1("AAAAACCCCCAAAAACCCCCCAAAAACCCCC")); // expected 答案不允许有duplicate elements

    }

    public static List<String> findRepeatedDnaSequences1(String s) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String cur = s.substring(i, i + 10);
//            if (map.containsKey(cur) && map.get(cur) + 10 <= i && !res.contains(cur)) {
            if (map.containsKey(cur) && !res.contains(cur)) {
                res.add(cur);
            } else if (map.containsKey(cur) == false) {
                map.put(cur, i);
            }
        }
        return res;
    }











    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>(); //todo bug2
        HashSet<String> res = new HashSet<>();
        for (int i = 9; i < s.length(); i++) {
            String cur = s.substring(i - 9, i + 1); // 相差的值 是长度
            if (set.contains(cur)) res.add(cur);
            else set.add(cur);          //todo bug1
        }
        List<String> list = new ArrayList<>(res);
        return list;
        
    }
}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying
 DNA, it is sometimes useful to identify repeated sequences within the DNA.

 Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

 For example,

 Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

 Return:
 ["AAAAACCCCC", "CCCCCAAAAA"].
 *
 参考网站
TODO ENGLISH
 nucleotides 核苷酸
 abbreviated 缩写
 molecule 分子

 TODO solotion

 1. 每个可能值 存入set
 2. 节省空间


 TODO case
 input : AAAAAAAAAAA 11个A
 output: AAAAAAAAAA AAAAAAAAAA
 expected: AAAAAAAAAA

 TODO bug

 bug1

 为了解决结果重复问题
 res 先用set存储
 case
 {
  input : AAAAAAAAAAA 11个A
  output: AAAAAAAAAA AAAAAAAAAA
  expected: AAAAAAAAAA
 }
 }

 bug2
HashMap<String> map = new HashMap<>(); // 速度慢 会overtime
 HashSet<String> set = new HashSet<>(); //

 bug3
 */

/*
TODO tutorial


 */
