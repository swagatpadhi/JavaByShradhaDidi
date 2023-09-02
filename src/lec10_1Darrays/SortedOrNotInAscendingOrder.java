package lec10_1Darrays;

import java.util.Scanner;

public class SortedOrNotInAscendingOrder {

    private static boolean checkIfArrayIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please enter an array: ");
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(checkIfArrayIsSorted(arr));
    }

}
