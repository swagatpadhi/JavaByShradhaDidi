package lec12_Strings;
import java.util.Scanner;
public class ReplaceEwithI {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter your String: ");
        String s = scn.next();
        String result = " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e'){
                result += 'i';
            }
            else {
                result += s.charAt(i);
            }
        }
        System.out.println("So the final String after replacing 'e' with 'i' is "+ result);
    }
}
