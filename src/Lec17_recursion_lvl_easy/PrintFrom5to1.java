package Lec17_recursion_lvl_easy;

public class PrintFrom5to1 {
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(5);
    }
}
