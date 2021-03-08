class Solution {
        int[] memo = new int[46];
    public int climbStairs(int n) {
        if(memo[n] != 0)
        if (n == 0) {
            memo[0] = 0;
            return 0;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n == 1) {
            memo[1] = 1;
            return 1;
        }
        if (n == 2) {
            memo[2] = 2;
            return 2;
        }

        memo[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return memo[n];
    }
}