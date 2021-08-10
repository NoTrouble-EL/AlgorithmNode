package cn.xiaohupao.sort.insert;

import cn.xiaohupao.sort.swap.Swap;

/**
 * @Author: Wukun
 * @Date: 2021/8/10上午11:17
 *
 * time:O(n^2)
 * space:O(1)
 */
public class InsertSort {

    public static void insertSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }

        for (int i = 1; i < nums.length; i++){
            for (int j = i; j > 0 && (nums[j] < nums[j-1]); j--){
                Swap.swap(nums, j, j-1);
            }
        }
    }
}
