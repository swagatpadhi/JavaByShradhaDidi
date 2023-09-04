package lec15_BitManipulation;
import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter 1 for set and 0 for clear: ");
        int oper = scn.nextInt();
        int num = 0b0101;
        int pos = 1;
        System.out.println("after modifying at position "+ pos+",");
        int bitmask = 1 << pos;

        if(oper == 1) {
            //set
            int newNum = (bitmask | num);
            System.out.println("new number is :" + newNum);
        }
        else {
            //clear
            int newNum = (num & ~(bitmask));
            System.out.println("new number is: "+ newNum);
        }


    }
}
