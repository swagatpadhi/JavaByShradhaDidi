package Lec17_recursion_lvl_easy;

public class ClimbingStairsNormal {
    public static void main(String[] args) {
        System.out.println(countNumberOfWays(3)+ " different ways");
    }

    private static int countNumberOfWays(int i) {
        //base case
        if (i == 0) return 1;
        if (i == 1) return 1;

        int ans = countNumberOfWays(i - 1) + countNumberOfWays(i - 2);
        return ans;
    }
}
