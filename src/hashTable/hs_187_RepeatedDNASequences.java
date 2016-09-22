package hashTable;

import java.util.*;

public class hs_187_RepeatedDNASequences {
    public static void main(String[] args) {

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
