package cn.xiaohupao.sort.shell;

import cn.xiaohupao.sort.swap.Swap;

/**
 * @Author: Wukun
 * @Date: 2021/8/10下午2:58
 *
 * time:O(n^{1.3} ~ O(n^{7/6}))
 * space:O(1)
 */
public class ShellSort {

    public static void shellSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        int h = 1;
        while (h < (nums.length / 3)){
            h = 3 * h + 1;
        }

        for (int gap = h; gap > 0; gap = (gap - 1) / 3){
            for (int i = gap; i < nums.length; i++){
                for (int j = i; (j > gap - 1) && (nums[j] < nums[j-gap]); j-=gap){
                    Swap.swap(nums, j, j-gap);
                }
            }
        }
    }
}
