package algorithms;

import java.util.Arrays;

/**
 * Created by wenjia on 6/12/2017.
 */
public class QuickSort {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low > high)
            return;

        int middle = low + (high - low) / 2;
        int mid_val = arr[middle];

        System.out.println(Arrays.toString(arr) + " low=" + low + " arr[" + middle + "]=" + mid_val + " high=" + high);

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < mid_val)
                i++;

            while (arr[j] > mid_val)
                j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            System.out.println("    " + Arrays.toString(arr) + " i=" + i + " j=" + j);
        }

        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);


    }
}
