package lec11_2Darrays;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = scn.nextInt();
        System.out.print("Enter number of columns: ");
        int col = scn.nextInt();
        int[][] x = new int[rows][col];
        System.out.println("Now start entering the 2d array: ");

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                x[i][j] = scn.nextInt();
            }
        }

        //printing transpose of matrix
        System.out.println("transpose is: ");
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
