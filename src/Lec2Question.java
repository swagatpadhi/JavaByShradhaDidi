//Make a program that prints the table of a number that is input by the user.
import java.util.Scanner;
public class Lec2Question {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number whose table you want to print:");
        int num = scn.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
