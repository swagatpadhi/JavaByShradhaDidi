package lec5_patterns_basic;
//inverted half pyramid with numbers
//1234
//123
//12
//1
public class Q7 {
    public static void main(String[] args){
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
