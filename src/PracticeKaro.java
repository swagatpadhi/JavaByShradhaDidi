public class PracticeKaro {
    public static void main(String[] args) {
        int[] arr = {1, 3,  3, 3, 3, 3, 6, 8, 9};
        System.out.println(findFirstOccurance(3, arr));
        System.out.println(findLastOccurance(3, arr));
    }

    private static int findLastOccurance(int key, int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        int rightMostInd = -1;
        while(si <= ei) {
            int mi = si + (ei - si)/2;
            if(key == arr[mi]) {
                si = mi + 1;
                rightMostInd = mi;
            }else if(key < arr[mi]) {
                ei = mi-1;
            }else if(key > arr[mi]) {
                si = mi + 1;
            }
        }
        return rightMostInd;
    }

    private static int findFirstOccurance(int key, int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        int leftMostInd = -1;
        while(si <= ei) {
            int mi = si + (ei - si)/2;
            if(key == arr[mi]) {
                ei = mi - 1;
                leftMostInd = mi;
            }else if(key < arr[mi]) {
                ei = mi-1;
            }else if(key > arr[mi]) {
                si = mi + 1;
            }
        }
        return leftMostInd;
    }
}
