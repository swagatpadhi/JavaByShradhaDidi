package lec13_StringBuilder;

public class ReplaceEWithIUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("cutie");
        System.out.println(sb+" is the string we want to replace 'e' with 'i'");
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == 'e') {
                sb.setCharAt(i,'i');
            }
        }
        System.out.println("after modification, sb = "+ sb);
    }
}
