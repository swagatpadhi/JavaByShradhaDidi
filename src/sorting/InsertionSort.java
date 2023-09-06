package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        //insertion sort
        for (int i = 2; i < arr.length; i++) {
            int currentElement = arr[i];
            //traversing in the sorted part and shifting
            int j = i - 1;
            while (j >= 0 && currentElement < arr[j]) {
                //shifting
                arr[j + 1] = arr[j];
                j--;
            }

            //inserting
            arr[j + 1] = currentElement;
        }

        System.out.println(Arrays.toString(arr));
    }
}
