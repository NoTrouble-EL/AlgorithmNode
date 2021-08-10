package cn.xiaohupao.sort.merge;

/**
 * @Author: Wukun
 * @Date: 2021/8/10下午3:15
 *
 * time:O(nlog(n))
 * space:O(n)
 */
public class MergeSort {

    public static void mergeSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }

        mergeSort(nums, 0, nums.length-1);
    }

    private static void mergeSort(int[] nums, int lo, int hi){
        //corner case
        if (lo >= hi){
            return;
        }

        int mid = ((hi - lo) >> 1) + lo;
        mergeSort(nums, lo, mid);
        mergeSort(nums, mid+1, hi);

        if (nums[mid] < nums[mid+1]){
            return;
        }

        merge(nums, lo, mid, hi);

    }

    private static void merge(int[] nums, int lo, int mid, int hi){
        int i = lo, j = mid+1, k = 0;
        int[] temp = new int[hi - lo + 1];

        //merge
        while (i <= mid && j <= hi){
            temp[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }

        while (i <= mid){
            temp[k++] = nums[i++];
        }

        while (j <= hi){
            temp[k++] = nums[j++];
        }

        //copy arr
        for (int index = 0; index < temp.length; index++){
            nums[lo + index] = temp[index];
        }
    }
}
