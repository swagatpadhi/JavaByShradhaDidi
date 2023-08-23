package lec3Questions;
//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a number a:");
        int a = scn.nextInt();
        System.out.print("Please enter a number b:");
        int b = scn.nextInt();
        System.out.println("enter 1 for addition\nenter 2 for subtraction\nenter 3 for" +
                "multiplication\nenter 4 for division\nenter 5 to find modulo");
        int choice = scn.nextInt();
        switch(choice){
            case 1:
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case 4:
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case 5:
                System.out.println(a+"%"+b+"="+(a%b));
                break;
            default:
                System.out.println("Invalid choice chosen by user");
        }
    }
}
