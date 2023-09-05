package sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 9, 6, 2};

        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //swap
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //printing the array after sorting
        System.out.println("after sorting the array becomes: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
