package lec3Questions;
//Ask the user to enter the number of the month & print the name of the month.
// For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number from 1-12");
        int num = scn.nextInt();
        switch(num){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("Invalid number entered by user");
        }
    }
}
