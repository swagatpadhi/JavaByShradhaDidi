package lec13_StringBuilder;

public class UserNameFromGmailUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("swagatkudfgfm06@gmail.com");
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '@') {
                sb.delete(i, sb.length());
            }
        }
        System.out.println("So the username is: "+ sb);
    }
}
