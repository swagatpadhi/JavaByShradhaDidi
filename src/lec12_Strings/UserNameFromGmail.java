package lec12_Strings;
import java.util.Scanner;
public class UserNameFromGmail {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your gmail: ");
        String gmail = scn.next();
        int index = 0;
        for(int i = 0; i < gmail.length(); i++) {
            if(gmail.charAt(i) == '@'){
                index = i;
                break;
            }
        }
        System.out.println("user-name is: "+gmail.substring(0,index));
    }
}
