package lec14_BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n = 0b101;
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit @ position "+pos+" was "+ 0);
        }
        else {
            System.out.println("bit @ position "+pos+" was "+ 1);
        }
    }
}
