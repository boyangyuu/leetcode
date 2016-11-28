package backtrack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class bt_78_ok_subsets {


    // res里的数组, 遵守递增 就会保持唯一, 1,2,3,12,13,23,123
    public static void main(String[] args) {
        List list;Map map;
        System.out.println(subsets1(new int[]{1,2,3}));

    }

    public static List<List<Integer>> subsets1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        help1(0, nums, res, new ArrayList<>());
        return res;

    }

    public static void help1(int start, int[] nums, List<List<Integer>> res, List<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
//            if (i != start && nums[i] == nums[i - 1]) continue; subsets2 用到
            tmp.add(nums[i]);
            help1(i + 1, nums, res, tmp); // todo bug  not help1(start + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }



    // bad
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(0, nums, new int[nums.length], new ArrayList<>(), res);
        return res;
    }

    public void help(int start, int[] nums, int[] visited, List<Integer> tmp, List<List<Integer>> res) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                tmp.add(nums[i]);
                help(i + 1, nums, visited, tmp, res);
                visited[i] = 0;
                tmp.remove(tmp.size() - 1);
            }
        }
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
 TODO translation

 TODO solotion
 ######s1######


 ######s2######

 ######sFinal######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
