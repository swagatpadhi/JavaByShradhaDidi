package lec4Questions;
//Print all even numbers till n.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n:");
        int inp = scn.nextInt();
        for(int i = 0; i <= inp; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
