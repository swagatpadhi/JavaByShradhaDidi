package lec16_sortingAndSearching;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 6};
        //outer-loops are for iterations and inner-loops are for
        //doing some work.
        //outer-loop runs for 5 time in this case.
        // i --> 0 to 4 (tab hi toh 5 times)
        // 4 means arr.length - 2
        for (int i = 0; i <= arr.length - 2; i++) {
            int minInd = i;//let element present in ith index is the minimum
            //element.
            for (int j = i; j <= arr.length - 1; j++) {
                //internal loop finds
                //minimum element's index in array.
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }

            //swap minInd element with current i position
            //of array.
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
