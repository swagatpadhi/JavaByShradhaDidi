package lec14_BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int num = 0b0101;
        int pos = 2;//position is always counted from right side here.
        int bitMask = 1 << pos;

        System.out.println("new number after clearing bit is: "+
                (num & ~(bitMask)));
        //here we will get 1 as o/p
        //in decimal form , not in binary form.
    }
}
