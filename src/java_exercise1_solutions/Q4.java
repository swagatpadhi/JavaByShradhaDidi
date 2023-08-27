package java_exercise1_solutions;
//Write a function that takes in the radius
// as input and returns the circumference of a circle
import java.util.Scanner;
public class Q4 {
    public static double findCircumference(int r){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter radius:");
        int r = scn.nextInt();
        System.out.println("Circumference is "+ findCircumference(r)+"units");
    }
}
