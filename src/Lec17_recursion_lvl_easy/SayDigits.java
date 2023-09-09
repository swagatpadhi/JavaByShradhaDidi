package Lec17_recursion_lvl_easy;

public class SayDigits {
    public static void main(String[] args) {
        sayDigit(32);
    }

    private static void sayDigit(int i) {
        String[] arr = {"zero","one","two", "three",
                        "four","five","six","seven",
                        "eight","nine"};
        if (i == 0)
            return;
        int digit = i % 10;
        int newNum = i / 10;
        sayDigit(newNum);
        System.out.println(arr[digit]);
    }
}
