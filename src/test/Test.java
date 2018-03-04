package test;

import algorithms.QuickSort;

/**
 * Created by wenjia on 6/12/2017.
 */
public class Test {
    public static void main(String[] arg) {
        int[] x = {7, 5, 9, 1, 10, 4, 8, 2, 3, 6};

        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(x);
    }
}
