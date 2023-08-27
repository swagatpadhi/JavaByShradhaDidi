package lec7_fuctions;
//Write a function to calculate the factorial of a number.
import java.util.Scanner;
public class Q2 {
    public static int findFactorial(int inp){
        int fact = 1;
        for(int i = 1; i <= inp; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int inp = scn.nextInt();
        System.out.println("So the factorial of "+inp+" = "+findFactorial(inp));
    }
}
