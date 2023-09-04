class Solution {
    static char[][] fill(int n, int m, char a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && a[i][j] == 'O') {
                    dfs(i, j, a);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'O') 
                    a[i][j] = 'X';
                else if (a[i][j] == 'V') 
                    a[i][j] = 'O';
            }
        }
        return a;
    }

    public static void dfs(int i, int j, char a[][]) {
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || a[i][j] != 'O') 
            return;

        a[i][j] = 'V';
        dfs(i + 1, j, a);
        dfs(i - 1, j, a);
        dfs(i, j + 1, a);
        dfs(i, j - 1, a);
    }
}
