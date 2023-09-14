package Lec17_recursion_lvl_easy;

public class XPowN {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = xPowN(10,3);
        System.out.println(ans);
    }
    private static int xPowN(int x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) return xPowN(x,n/2) * xPowN(x,n/2);
        else return xPowN(x,n/2) * xPowN(x,n/2) * x;
    }
}
