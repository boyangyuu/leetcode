package array;

import java.util.ArrayList;
import java.util.List;

public class a_119_PascalsTriangle2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList();
        for (int i = 0; i <= rowIndex; i++) { //todo bug 1
            for (int j = i; j >= 0; j--) {  // todo bug 2
                if (j == i || j == 0) {
                    if (row.size() <= i) row.add(j , 1);
                    else row.set(j, 1);
                }
                else row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}



/** Solution

 todo solution
 wrong solution
 for (int j = 0; j <= i; j--) {
 =>
 for (int j = i; j >= 0; j--) {  // todo bug 2


 本题需要从后往前 去迭代生成数组
 case k = 4
 output : {1,3,4,1}
 expected: {1,3,3,1}

 todo bug

 bug1
 for (int i = 0; i <= rowIndex; i++) { //todo bug 1
 =>
 for (int i = 0; i < rowIndex; i++) { //todo bug 1

 case
 k = 0
 output : null
 expected : { {1}  } k == 0 means 1 row not 0 row


 bug2


 */