import java.util.Scanner;

public class ThalaOrNot {
    public static void main(String[] args) {
        System.out.print("enter a word:");
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int result = thalaForAReason(s);
        if (result == 7) {
            char[] charArray = s.toCharArray();

            for (int i=0; i <= charArray.length-1; i++) {
                System.out.print(charArray[i] + "");
                if (i < charArray.length - 1) {
                    System.out.print("+");
                }
                if(i == charArray.length-1){
                    System.out.println("=7");
                }
            }

            System.out.println("Thala For a Reason");
        }
        else{
            System.out.println("try any other word.");
        }

    }

    public static int thalaForAReason(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        for (int j = 0; j < charArray.length; j++) {
            i++;
        }
        if (i == 7) {
            return 7;
        } else {
            return -1;
        }
    }
}
