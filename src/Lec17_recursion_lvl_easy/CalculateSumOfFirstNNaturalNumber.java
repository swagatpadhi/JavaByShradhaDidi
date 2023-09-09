package Lec17_recursion_lvl_easy;

public class CalculateSumOfFirstNNaturalNumber {
    public static int calcFirstNNaturalNumberSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + calcFirstNNaturalNumberSum(number - 1);
    }

    public static void calcSumNaturalNumbers(int n, int end, int sum) {
        if (n == end) {
            sum += end;
            System.out.println(sum);
            return;
        }
        sum += n;
        calcSumNaturalNumbers(n + 1, end, sum);
    }
    public static void main(String[] args) {
        System.out.println(calcFirstNNaturalNumberSum(5));
//      calcSumNaturalNumbers(1, 5, 0);
    }
}
