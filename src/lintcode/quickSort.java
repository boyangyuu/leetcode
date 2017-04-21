package lintcode;

import java.lang.reflect.Array;
import java.util.Arrays;

class NBComparator {
    public int cmp(String a, String b) {
        return 0;
    }
}

public class quickSort {
    public static void main(String[] args) {
        int[] a = new int[] {3,4,2,3,1};
        sort(a, 0, a.length - 1);
        System.out.println(getKth(a, 2));
        System.out.println(Arrays.toString(a));
//        System.out.println(help(a, 0, a.length - 1, 4));
    }

    public void sortNutsAndBolts(String[] nuts, String[] bolts, NBComparator compare) {
        // write your code here



    }



    public static int getKth(int[] nums, int k) {
        return help(nums, 0, nums.length - 1, k);
    }

    public static int help(int[] nums, int i, int j, int k) {
        int p = partion(nums, i, j);
        if (p == k - 1) return nums[p];
        else if (p < k - 1) return help(nums, p + 1, j, k);
        else return help(nums, i, p - 1, k);
    }

    public static void sort(int[] nums, int i, int j) {
        int p = partion(nums, i, j);
        if (i >= j) return;
        sort(nums, p + 1, j);
        sort(nums, i, p - 1);
    }

    public static int partion(int[] nums, int i, int j) {
        int origin = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= origin) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= origin) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = origin;
        return i;
    }

}