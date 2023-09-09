package lec16_sortingAndSearching;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] x = {7,8,3,1,2};

        //selection sort
        //time complexity - O(n^2)
        for (int i = 0; i < x.length - 1; i++) {
            int smallestInd = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[smallestInd] > x[j]) {
                    smallestInd = j;
                }
            }
            //swap
            int temp = 0;
            temp = x[smallestInd];
            x[smallestInd] = x[i];
            x[i] = temp;
        }
        //after sorting
        System.out.println(Arrays.toString(x));
    }
}
