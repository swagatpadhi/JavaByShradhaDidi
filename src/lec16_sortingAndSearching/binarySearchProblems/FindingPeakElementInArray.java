package lec16_sortingAndSearching.binarySearchProblems;

public class FindingPeakElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        int ans = findPeak(arr);
        System.out.println("peak is @ "+ans);
    }

    private static int findPeak(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        while(si < ei) {
            int mi = si + (ei-si)/2;
            if (arr[mi] < arr[mi + 1]) si = mi + 1;
            else ei = mi;
        }
        return si;//as both are going to be same we could also return ei
    }
}
