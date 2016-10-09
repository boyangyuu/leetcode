package tutorials;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        System.out.println(binarySearch.bSearch(nums, 0));
    }




    //查找 哪里可以插入 同样适用于二分查找数字的目标位
    public static int bSearch(int[] nums, int target){
        int head = 0;
        int tail = nums.length -1;
        int mid;
        while(head <= tail){
            mid = (head + tail) / 2;
            int v = nums[mid];
            if (target > v) {

                // 二分插入查找 begin
                if (mid == nums.length - 1) return tail;
                else if (target < nums[mid + 1]) return mid;

                // 二分查找查找 end

                else {
                    head = mid + 1;  //二分查找的话 只需要这句话
                }

            }
            else if (target < v) tail = mid - 1;
            else {
                return mid;
            }
        }
        return head;
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

todo solution
利用二分查找算法, 当 < target时候 做前后判断是否可以插入, a[i] < target < a[i+1]
 永远不能插入只有可能是 [0] < target! 二分查找自动定位在0处

 注意 int取整 默认向下取整~!! int a = 1.9 , a value 为 1!!

todo bug
 bug1
 bug2
 bug3
 */