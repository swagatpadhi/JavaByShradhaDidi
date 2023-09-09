package Lec17_recursion_lvl_easy;

public class PrintNthTermOfFibonacciSequence {
    public static void main(String[] args) {
        System.out.println(printNthTermOfFibonacciSequence(4));// O/P should be 3
    }

    private static int printNthTermOfFibonacciSequence(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;

        int ans = printNthTermOfFibonacciSequence(i - 1) + printNthTermOfFibonacciSequence(i - 2);
        return ans;
    }
}
