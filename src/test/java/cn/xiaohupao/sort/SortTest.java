package cn.xiaohupao.sort;

import cn.xiaohupao.sort.bubble.BubbleSort;
import cn.xiaohupao.sort.insert.InsertSort;
import cn.xiaohupao.sort.selection.SelectionSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: Wukun
 * @Date: 2021/8/10上午10:06
 */
public class SortTest {

    private final int[] needSortArr = {2,8,7,0,4,6,1,16,5,45};

    @Test
    public void bubbleSortTest(){
        BubbleSort.bubbleSort3(needSortArr);
    }

    @Test
    public void selectionSortTest(){
        SelectionSort.selectionSort2(needSortArr);
    }

    @Test
    public void insertSort(){
        InsertSort.insertSort(needSortArr);
    }

    @Before
    public void before(){
        System.out.println(Arrays.toString(needSortArr));
    }

    @After
    public void after(){
        System.out.println(Arrays.toString(needSortArr));
    }
}
