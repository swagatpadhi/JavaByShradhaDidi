package Lec17_recursion_lvl_easy;

public class FibonacciSequence {
    // 0 1 1 2 3 5 8 13 ...

    public static void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 1; i <= n; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void fibonacciRecursive(int a, int b, int n){
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacciRecursive(b, c, n -1);
    }

    public static void main(String[] args) {
        //        fibonacci(5);
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 5;
        fibonacciRecursive(a, b, n-2);
    }
}
