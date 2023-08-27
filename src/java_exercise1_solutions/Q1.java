package java_exercise1_solutions;
//Enter 3 numbers from the user &
//make a function to print their average.
import java.util.Scanner;
public class Q1 {
    static int findAverage(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter 3 numbers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println("Average = "+ findAverage(a,b,c));
    }
}
