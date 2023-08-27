package lec5_patterns_basic;
//half pyramid with numbers
//1
//12
//123
//1234
public class Q6 {
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
