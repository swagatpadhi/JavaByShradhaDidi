package Lec17_recursion_lvl_easy;

public class Calculate2PowerN {
    public static void main(String[] args) {
        System.out.println(calculate2PowerN(3));
    }

    private static int calculate2PowerN(int i) {
        if (i == 0) {
            return 1;
        }
        return 2 * calculate2PowerN(i -1);
    }
}
