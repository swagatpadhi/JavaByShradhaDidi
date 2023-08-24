package lec4Questions;
// Print if a number is prime or not (Input n from the user).
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("please enter a number:");
        int num = scn.nextInt();
        int flag = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("composite");
        }else{
            System.out.println("prime");
        }
    }
}
