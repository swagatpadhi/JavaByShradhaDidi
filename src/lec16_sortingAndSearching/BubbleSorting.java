package lec16_sortingAndSearching;
import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        //sorting
        //time complexity - O(n^2)
        for (int i = 0; i < arr.length - 1 ; i++){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap;
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
