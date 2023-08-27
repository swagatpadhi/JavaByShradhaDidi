package java_exercise1_solutions;
//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.Scanner;
public class Q10 {
    public static void printFibonacii(int n) {
    System.out.print(0+".."+1+"..");
    int a = 0;
    int b = 1;
    int sum = 0;
    for(int i = 1; i <= n-2; i++){
        sum = a + b;
        System.out.print(sum+"..");
        a = b;
        b = sum;
    }
}
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the value of n to print Fibonacci " +
                "series of n terms");
        int n = scn.nextInt();
        printFibonacii(n);
    }


}
