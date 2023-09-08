package Lec17_recursion_lvl_easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        int[] memo = new int[45 + 1];
        System.out.println(countWays(45, memo)+" possible ways");
    }

    private static int countWays(int i, int[] memo) {
        if (i == 0) return 1;
        if (i == 1) return 1;

        if (memo[i] > 0) return memo[i];
        int value = countWays(i-1, memo) + countWays(i -2, memo);
        memo[i] = value;
        return value;
    }
}
