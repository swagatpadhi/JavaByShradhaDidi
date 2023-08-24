package lec4Questions;
//print the sum of first n natural numbers.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter value of n:");
        int inp = scn.nextInt();
        int sum = 0;
        for(int i = 1; i <= inp; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
