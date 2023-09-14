package lec16_sortingAndSearching.binarySearchProblems;

public class FirstAndLastOccuranceOfElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5};
        int key = 3;
        System.out.println("first occurance is "+firstOccurance(arr, key));
        System.out.println("last occurance is "+lastOccurance(arr, key));
    }

    private static int lastOccurance(int[] arr, int key) {
        int si = 0;
        int ei = arr.length - 1;
        int ans = -1;
        while (si <= ei) {
            int mi = si + (ei - si)/2;
            if ( arr[mi] == key) {
                ans = mi;
                si = mi + 1;
            }else if (arr[mi] > key) {
                ei = mi - 1;
            }else if (arr[mi] < key) {
                si = mi + 1;
            }
        }
        return ans;
    }

    private static int firstOccurance(int[] arr, int key) {
        int si = 0;
        int ei = arr.length - 1;
        int ans = -1;
        while(si <= ei) {
            int mi = si + (ei - si)/2;
            if ( arr[mi] == key) {
                ans = mi;
                ei = mi - 1;
            }else if (arr[mi] < key) {
                si = mi + 1;
            }else if (arr[mi] > key) {
                ei = mi - 1;
            }
        }
        return ans;
    }
}
