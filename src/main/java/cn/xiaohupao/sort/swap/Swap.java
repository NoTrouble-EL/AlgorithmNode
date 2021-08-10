package cn.xiaohupao.sort.swap;

/**
 * @Author: Wukun
 * @Date: 2021/8/10上午9:59
 */
public class Swap {
    public static void swap(int[] nums, int i ,int j){
        if (nums == null || nums.length < 2){
            return;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
