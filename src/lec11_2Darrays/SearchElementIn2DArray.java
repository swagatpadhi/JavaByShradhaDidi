package lec11_2Darrays;
import java.util.Scanner;

public class SearchElementIn2DArray {
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
        System.out.print("enter key to search in the array: ");
        int key = scn.nextInt();

        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < col; j++){
                if (x[i][j] == key) {
                    System.out.println("found @ index: "+"("+i+","+j+")");
                }
            }
        }
    }
}
