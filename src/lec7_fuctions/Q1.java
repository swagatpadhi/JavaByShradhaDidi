package lec7_fuctions;
//write a function to add 2 numbers taken input from user.
import  java.util.Scanner;
public class Q1 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter 2 no.s:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Sum is " + sum(a,b));
    }
}
