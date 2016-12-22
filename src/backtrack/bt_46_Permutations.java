package backtrack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


// 12/21 8:29 --
public class bt_46_Permutations {
    public static void main(String[] args) {
        List list;Map map;
        System.out.println(permute1(new int[]{1,1,3}));
    }

    public static List<List<Integer>> permute1(int[] nums) {
        int[] visited = new int[nums.length];
        Arrays.sort(visited);
        List<List<Integer>> res = new ArrayList<>();
        help1(nums, visited, res, new ArrayList<>());
        return res;
    }

    public static void help1(int[] nums,int[] visited, List<List<Integer>>res, List<Integer> temp) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if (visited[j] == 1) continue;
            if (j >= 1 && nums[j] == nums[j - 1]) continue;
            visited[j] = 1;
            temp.add(nums[j]);
            help1(nums, visited, res, temp);
            temp.remove(temp.size() - 1);
            visited[j] = 0;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(nums, new int[nums.length], new ArrayList<>(), res);
        return res;
    }

    public void help(int[] nums, int[] visited, List<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                tmp.add(nums[i]);
                help(nums, visited, tmp, res);
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
 note the solution set must not contain duplicate combinations.
 不允许出现 重复的combination组合


 TODO solotion
 ######s1######
 backtracking

 int[] visited // 已经访问过的数字 (0:没有访问过:可添加, 1 访问过 不可添加)


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
