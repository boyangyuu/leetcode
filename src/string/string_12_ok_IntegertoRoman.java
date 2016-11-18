package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_12_ok_IntegertoRoman {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public String intToRoman(int num) {
        int[] nums = {1,4,5,9, 10,40,50,90, 100,400,500,900, 1000};
        String[] strs = {"I","IV","V","IX", "X","XL","L","XC", "C","CD","D","CM", "M"};
        String res = "";
        while (num != 0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > num) continue;
                num -= nums[i];
                res += strs[i];
                break;
            }
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


 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######


 TODO case

 TODO bug

 bug2
 bug3
 */




