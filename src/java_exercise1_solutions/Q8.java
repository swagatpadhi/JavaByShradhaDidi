package java_exercise1_solutions;
//Two numbers are entered by the user, x and n.
// Write a function to find the value of one number raised to the power of another
// i.e. x^n.
import java.util.Scanner;
public class Q8 {
    public static void calculatePower(int b, int p){
        int result = 1;
        int i = 1;
        while(i <= p){
            result = result*b;
            i++;
        }
        System.out.println(b+"^"+p+"="+result);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("please enter the base: ");
        int base = scn.nextInt();
        System.out.print("please enter the power: ");
        int power = scn.nextInt();
        calculatePower(base, power);
    }
}
