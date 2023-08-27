package lec6_patterns_advance;
//diamond pattern
//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *
public class Q1 {
    public static void main(String[] args){
        //upper part
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part(we just reversed the outer for loop)
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
