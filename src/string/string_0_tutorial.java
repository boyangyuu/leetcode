package string;

import java.util.Arrays;
import java.util.Comparator;

public class string_0_tutorial {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        String s = "a,b,c,d,e,f,g";

        //upper
        System.out.println(s.toUpperCase());
        System.out.println("lower: " + 'a' + "upper" + Character.toUpperCase('a'));

        // todo convert string to int
        String ints = "123";
        System.out.println("string => int:  " + Integer.parseInt(ints));


        //todo string substring
        System.out.println("substring from 0 to 1: " + s.substring(0,2));

        // indexOf
        s = "a,b,c";
        int end = s.indexOf(',' , 3); // the index of "/"
        System.out.println("index of 用法 输入查找字符 及start坐标 :" + end);

        // charArray so I can modified the string
        char[] chars = s.toCharArray();
        chars[1] = '-';
        chars[1 + 1] = '-';
        String news = new String(chars);
        System.out.println("charArray : " + news);

        // compareTo 默认按照 "abcd 1234" 排序
        Integer[] list = new Integer[nums.length];
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                return (s1 + s2).compareTo(s2 + s1); // todo
            }
        };
        Arrays.sort(list, com);        // Arrays.sort(, com) 后面可接comparer

    }
}


/** Solution

TODO tutorial

 todo string 转 char array


 todo #数字转char
 char c = (char)('A' + 1); todo A => B


 todo 分割字符串
 String[] strs = path.split("/"); //
 tag: string_71_
 case: "/a"
 output : {"", "a"} // alert!! 会有""的存在

 split : "." "*" "|" , String[] v1s = version1.split("\\.");
 split : "\" , String[] v1s = version1.split("\\\\");


 todo trim
 去除两边空格

 todo int convert to string
 int res = Integer.parseInt("-1")

 todo string reverse
 case string_344_reverseString
 s = new StringBuffer(s).toString();
todo String 是不可改变指定字符的!!!

 todo。。

 */


