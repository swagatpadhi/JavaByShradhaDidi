package java_exercise1_solutions;
//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class Q2 {
    static int sumOfOddNumbers(int inp){
        int sum = 0;
        for(int i = 1; i <= inp; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int inp = scn.nextInt();
        System.out.println("sum is "+sumOfOddNumbers(inp));
    }
}
