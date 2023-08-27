package lec5_patterns_basic.homeworkproblems5;
//   *****
//  *****
// *****
//*****
//solid rhombus
public class HQ1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
