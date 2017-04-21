package 面经.amz;

import java.util.*;

/*
size k window, get all windows's sum


 */
/**
 * Created by yuboyang on 2/20/17.
 */
public class SumOfWindow {
    public static void main(String[] args) {
        System.out.println(GetSum(new int[]{4,3,1,2}, 1));
    }

    public static List<Integer> GetSum(int[] array, int k) {
        ArrayList<Integer> result  = new ArrayList<>();
        if (array == null || array.length == 0 || k <= 0 || k > array.length) return result;
        int sum = 0;
        for (int i = 0; i < k; i++) sum += array[i];
        result.add(sum);

        for (int i = 1; i < array.length - k + 1; i++) {
            sum = sum + array[i + k - 1] - array[i - 1];
            result.add(sum);
        }
        return result;
    }
}
