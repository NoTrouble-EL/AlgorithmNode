package cn.xiaohupao.sort.selection;

import cn.xiaohupao.sort.swap.Swap;

/**
 * @Author: Wukun
 * @Date: 2021/8/10上午9:58
 *
 * time:O(n^2)
 * space:O(1)
 */
public class SelectionSort {

    public static void selectionSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }

        for (int i = 0; i < nums.length; i++){
            //Record the index of the current smallest element
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            Swap.swap(nums, i, minIndex);
        }
    }

    public static void selectionSort2(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }

        for (int i = 0; i < (nums.length >> 1); i++){
            //Record the index of the current smallest element
            int minIndex = i;
            //Record the index of the current largest element
            int maxIndex = i;
            for (int j = i+1; j < nums.length - i; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
                if (nums[maxIndex] < nums[j]){
                    maxIndex = j;
                }
            }
            //The maximum index and minimum index are equal to indicate that the sorting is complete
            if (minIndex == maxIndex){
                break;
            }
            Swap.swap(nums, i,minIndex);
            //If the maximum index is the same as i, since i has been exchanged with the minimum index, the maximum index needs to be modified
            if (maxIndex == i){
                maxIndex = minIndex;
            }
            Swap.swap(nums, nums.length-1-i,maxIndex);
        }
    }
}
