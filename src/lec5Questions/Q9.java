package lec5Questions;
//0-1 Triangle
//1
//01
//101
//0101
//10101
public class Q9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
