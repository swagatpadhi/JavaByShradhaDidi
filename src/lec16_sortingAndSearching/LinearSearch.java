package lec16_sortingAndSearching;

public class LinearSearch {
    public static int linearSearch(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,4,6,3,9};
        int key = 6;
        int ans = linearSearch(6, arr);
        if (ans == -1)
            System.out.println("array element not found");
        else
            System.out.println("array element found @ "+ans);

    }
}
