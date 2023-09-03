package lec12_Strings;
import java.util.Scanner;
public class TotalLengthOfAStringArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = scn.nextInt();
        String[] s = new String[size];
        System.out.println("Now Start entering the elements for your string array:");
        for (int i = 0; i < s.length; i++) {
            //here we will take only words as element
            s[i] = scn.next();
        }

        int totLen = 0;
        for(int i = 0; i < s.length; i++){
            totLen = totLen + s[i].length();
        }
        System.out.println("So length of the whole String array: "+ totLen);
    }
}
