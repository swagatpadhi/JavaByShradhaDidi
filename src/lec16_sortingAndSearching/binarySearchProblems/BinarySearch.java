package lec16_sortingAndSearching.binarySearchProblems;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,4,3,2};
        Arrays.sort(arr);
        int key = 8;
        System.out.println(binarySearch2(arr, key));
    }
    //time complexity is O(logn)
    public static boolean binarySearch2(int[] arr, int key) {
        int si = 0;
        int ei = arr.length - 1;
        while ( si <= ei) {
            int mi = si + (ei/2 - si/2);
            if ( arr[mi] == key) {
                return true;
            }
            else if (arr[mi] < key) {
                si = mi + 1;
            }
            else {
                ei = mi - 1;
            }
        }
        return false;
    }
}
