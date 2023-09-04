package lec14_BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num = 0b0101;//in binary system leading 0s
        // don't change the value represented by binary number.
        int pos = 1;
        int bitMask = 1 << pos;

        System.out.println("new number is "+ (bitMask | num));
        //here actually we got 0111, but it will print as 7
        //as 0111 is 7 in decimal.
    }
}
