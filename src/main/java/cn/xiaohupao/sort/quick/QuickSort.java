package cn.xiaohupao.sort.quick;

import cn.xiaohupao.sort.swap.Swap;

/**
 * @Author: Wukun
 * @Date: 2021/8/10下午3:06
 *
 * time:O(nlog(n))
 * space:O(log(n))
 */
public class QuickSort {

    public static void quickSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }

        quickSort(nums, 0, nums.length-1);
    }

    private static void quickSort(int[] nums, int lo, int hi){
        //corner case
        if (lo >= hi){
            return;
        }

        int pivot = partition(nums, lo, hi);
        quickSort(nums, lo, pivot-1);
        quickSort(nums, pivot+1, hi);
    }

    private static int partition(int[] nums, int lo, int hi){
        int pivot = nums[lo];
        int i = lo, j = hi+1;
        while (true){
            while (nums[++i] < pivot){
                if (i == hi){
                    break;
                }
            }
            while (nums[--j] > pivot){
                if (j == lo){
                    break;
                }
            }
            if (i >= j){
                break;
            }else{
                Swap.swap(nums, i, j);
            }
        }

        Swap.swap(nums, j, lo);
        return j;
    }
}
