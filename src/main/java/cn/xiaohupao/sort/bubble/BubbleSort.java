package cn.xiaohupao.sort.bubble;

import cn.xiaohupao.sort.swap.Swap;

/**
 * @Author: Wukun
 * @Date: 2021/8/10上午9:31
 *
 * Time:O(n^2)
 * Space:O(1)
 */
public class BubbleSort {
    public static void bubbleSort1(int[] nums){
        if(nums == null || nums.length < 2){
            return;
        }
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] > nums[j+1]){
                    Swap.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void bubbleSort2(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }

        boolean flag = true;
        for (int i = 0; i < nums.length; i++){
            if (!flag){
                break;
            }
            flag = false;
            for (int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] > nums[j+1]){
                    Swap.swap(nums, j, j+1);
                    flag = true;
                }
            }
        }

    }

    public static void bubbleSort3(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        int indexOfLast = nums.length - 1;
        int swappedIndex = -1;
        boolean flag = true;

        while (flag){
            flag = false;
            for (int i = 0; i < indexOfLast; i++){
                if (nums[i] > nums[i+1]){
                    Swap.swap(nums, i, i+1);
                    flag = true;
                    swappedIndex = i;
                }
            }
            indexOfLast = swappedIndex;
        }
    }

}
