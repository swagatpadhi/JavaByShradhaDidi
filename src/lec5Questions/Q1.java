package lec5Questions;
//solid rectangle
public class Q1 {
    public static void main(String[] args){
        int row = 4;
        int column = 3;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
