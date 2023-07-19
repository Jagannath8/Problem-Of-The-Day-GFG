class Solution{
    public int longestPalinSubseq(String S){
        int n = S.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++)
            dp[i][i] = 1;

        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (S.charAt(i) == S.charAt(j) && cl == 2)
                    dp[i][j] = 2;
                else if (S.charAt(i) == S.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
            }
        }

        return dp[0][n - 1];
    }
}
