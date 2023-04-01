package com.xingy.structural.adapter.objectAdapter;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.adapter.objectAdapter.OperationAdapter
 * @date 2019/06/22 21:24
 * @description
 */ //操作适配者：适配器
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter() {
        this.sortObj = new QuickSort();
        this.searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
