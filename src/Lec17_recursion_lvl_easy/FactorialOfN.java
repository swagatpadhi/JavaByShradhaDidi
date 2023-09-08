package Lec17_recursion_lvl_easy;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(calcFact(5));
    }

    private static int calcFact(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        int fact_im1 = calcFact(i - 1);
        int fact_i = i * fact_im1;
        return fact_i;
    }
}
