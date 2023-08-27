package java_exercise1_solutions;
//Write a function which takes in 2 numbers and
// returns the greater of those two.
import java.util.Scanner;
public class Q3 {
    public static void greaterNumber(int a, int b){
        if(a > b){
            System.out.println(a+" is greater than "+b);
        }
        else if (b > a) {
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println(a+"="+b);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter 2 no.s:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        greaterNumber(a,b);
    }
}
