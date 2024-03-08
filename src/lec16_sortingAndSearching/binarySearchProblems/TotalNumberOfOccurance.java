package lec16_sortingAndSearching.binarySearchProblems;

public class TotalNumberOfOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,3,3,5};
        int key = 2;
        System.out.println("total occurance of "+key+" is "+totalOccurance(arr, key));
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

    public static int totalOccurance(int[] arr, int key) {
        int firstOccInd = firstOccurance(arr, key);
        int lastOccInd = lastOccurance(arr, key);
        if(firstOccInd == -1 || lastOccInd == -1) {
            return 0;
        }
        return ((lastOccInd - firstOccInd) + 1);
    }
}
