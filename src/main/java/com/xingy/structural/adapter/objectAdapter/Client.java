package com.xingy.structural.adapter.objectAdapter;

//抽象成绩操作类：目标接口
interface ScoreOperation {
    public int[] sort(int array[]); // 成绩排序
    public int search(int array[], int key); //成绩查找
}

public class Client {
    public static void main(String[] args){
        // ScoreOperation operation = (ScoreOperation) XMLUtil.getBean();
        ScoreOperation operation = new OperationAdapter();
        int scores[] = {80, 79, 88, 90, 91, 96, 87};
        int result[];
        int score;
        System.out.println("成绩排序结果： ");
        result = operation.sort(scores);
        //循环输出成绩

        for (int i : result) {
            System.out.println(i + "");
        }
        System.out.println();

        System.out.println("查找成绩90： ");
        score = operation.search(scores, 90);
        if (score != -1) {
            System.out.println("查找到成绩90。");
        } else {
            System.out.println("未查找到成绩90。");
        }

    }
}

//快速排序类：适配者
class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int array[], int p, int r) {
        int q = 0;
        if (p<r) {
            q = partition(array, p, r);
            sort(array, p, q-1);
            sort(array, q + 1, r);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        int j = p - 1;
        for (int i = p;i<=r - 1;i++) {
            if (a[i] <= x) {
                j++;
                swap(a, j, i);
            }
        }
        swap(a, j+1, r);
        return j+1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

//二分查找类：适配者
class BinarySearch {
    public int binarySearch(int array[], int key) {
        int low = 0;
        int height = array.length - 1;
        while (low <= height) {
            int mid = (low + height) / 2;
            int midVal = array[mid];
            if (key < midVal) {
                height = mid - 1;
            } else if (key > midVal) {
                low = mid + 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}

