package java_exercise1_solutions;
//Write a program to enter the numbers till the user wants and at the end
// it should display the count of positive, negative and zeros entered.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int negCount=0;
        int posCount=0;
        int zeroesCount=0;
        char ch;
        do{
            System.out.print("enter input:");
            int inp = scn.nextInt();
            if(inp == 0){
                zeroesCount++;
            }else if(inp < 0){
                negCount++;
            }else{
                posCount++;
            }
            System.out.println("Do you want to enter again? y(yes) n(no)");
            ch = scn.next().charAt(0);
        }while(ch == 'y');
        System.out.println("no of times positive numbers entered:"+posCount);
        System.out.println("no of times negative numbers entered:"+negCount);
        System.out.println("no of zeroes entered:"+zeroesCount);
    }
}
