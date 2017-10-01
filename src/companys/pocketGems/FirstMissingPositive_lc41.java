package companys.pocketGems;

/**
 * Created by yuboyang on 7/6/17.
 */
public class FirstMissingPositive_lc41 {
    /*
[3,4,-1,1]


*/
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int cur = nums[i]; // 想换的位置 3
            if (nums[i] != i + 1 && cur <= nums.length && cur > 0 && nums[cur - 1] != nums[i]) { //
                int temp = nums[i];
                nums[i] = nums[cur - 1];
                nums[cur - 1] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) if (nums[j] != j + 1) return j + 1;
        return nums.length + 1;
    }
}
