package lec10_1Darrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Please enter an array: ");
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("enter the key:");
        int key = scn.nextInt();

        searchElementInArray(arr, key);
    }

    private static void searchElementInArray(int[] arr, int key) {
        int flag = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("key found at index " + i);
        }else{
            System.out.println("key is not present in array");
        }
    }
}
