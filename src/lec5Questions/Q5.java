package lec5Questions;
//inverted half pyramid
//(rotated by 180 degrees)
//   *
//  **
// ***
//****
public class Q5 {
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}