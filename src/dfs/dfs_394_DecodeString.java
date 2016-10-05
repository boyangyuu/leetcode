package dfs;

import tree.TreeNode;

public class dfs_394_DecodeString {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
        int a = Integer.getInteger("1");
        System.out.print(a);
    }

    public String decodeString(String s) {

        return null;
    }

    public String help(String s, int times) {
        if (times == 0) {
            int index = 0;
            String sNew = "";

            //get timesNew
            while (s.charAt(index) != '[') {
                if (s.charAt(index) <= '9' && s.charAt(index) >= '0'){
                    index++;
                    times += times * 10 + s.charAt(index) - '0';
                } else {
                    break;
                }
            }

            while(s.charAt(index) != '】') {
                if (s.charAt(index) == '[') {
                    index++;
                    continue;
                };
                sNew += s.charAt(index);
                index++;
            }
        }



        return null;
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
 *
 参考网站


 TODO solotion
 f(String s, int times) = {
    if (times == 0)
       s += f (s.sub, times);

    else
      s += f(s, times - 1);
 }



 TODO case

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
