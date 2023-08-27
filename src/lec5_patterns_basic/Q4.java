package lec5_patterns_basic;
//Inverted half pyramid
//****
//***
//**
//*
public class Q4 {
    public static void main(String[] args) {
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
