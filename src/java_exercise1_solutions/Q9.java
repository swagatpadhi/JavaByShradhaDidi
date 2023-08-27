package java_exercise1_solutions;
//find gcd of 2 no.s
import java.util.Scanner;
public class Q9 {
    public static void gcd(int a, int b){
        if(a >= 0 && b >= 0){
            for(;b!=0;){
                int r = a % b;
                a = b;
                b = r;
            }
            if(a == 0){
                System.out.println("gcd is "+b);
            }else{
                System.out.println("gcd is "+a);
            }
        }
        else{
            System.out.println("You entered -ve no.s \n try again");
            return;
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter 2 no.s:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        gcd(a,b);
    }
}
